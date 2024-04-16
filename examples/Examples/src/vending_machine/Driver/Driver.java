package vending_machine.Driver;

import vending_machine.Coin.Coin;
import vending_machine.Inventory.InventoryManager;
import vending_machine.Item.Item;
import vending_machine.Item.ItemShelf;
import vending_machine.Item.ItemType;
import vending_machine.State.Impl.InitialState;
import vending_machine.State.State;
import vending_machine.VendingMachine.VendingMachine;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(new InitialState(), new InventoryManager(10), new ArrayList<>());
        System.out.println("|");
        System.out.println("filling up the inventory");
        System.out.println("|");

        fillUpInventory(machine);
        displayInventory(machine);

        System.out.println("|");
        System.out.println("clicking on InsertCoinButton");
        System.out.println("|");

        State vendingState = machine.getState();
        vendingState.clickInsertCoinBtn(machine);
        vendingState = machine.getState();
        vendingState.insertCoin(machine, Coin.INR_2);
        vendingState.insertCoin(machine, Coin.INR_10);

        System.out.println("|");
        System.out.println("clicking on ProductSelectionButton");
        System.out.println("|");
        vendingState.clickProductSelectionBtn(machine);

        vendingState = machine.getState();
        vendingState.chooseProduct(machine, 106);

        displayInventory(machine);
    }

    private static void fillUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventoryManager().getInventory();
        for (int i = 0; i < slots.length; i++) {
            Item newItem = new Item(null, 0);
            if (i < 3) {
                newItem.setType(ItemType.COKE);
                newItem.setPrice(12);
            } else if (i < 5) {
                newItem.setType(ItemType.BISCUIT);
                newItem.setPrice(9);
            } else if (i < 7) {
                newItem.setType(ItemType.CHIPS);
                newItem.setPrice(13);
            } else if (i < 10) {
                newItem.setType(ItemType.LASSI);
                newItem.setPrice(7);
            }
            slots[i].setItem(newItem);
            slots[i].setAvailable(true);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventoryManager().getInventory();
        for (ItemShelf slot : slots) {
            System.out.println("CodeNumber: " + slot.getCode() +
                    " Item: " + slot.getItem().getType().name() +
                    " Price: " + slot.getItem().getPrice() +
                    " isAvailable: " + slot.isAvailable());
        }
    }


}
