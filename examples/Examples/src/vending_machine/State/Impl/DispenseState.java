package vending_machine.State.Impl;

import vending_machine.Coin.Coin;
import vending_machine.Item.Item;
import vending_machine.State.State;
import vending_machine.VendingMachine.VendingMachine;

import java.util.List;

public class DispenseState implements State {

    public DispenseState(VendingMachine machine, int code) {
        System.out.println("Dispense state.");
        dispenseItem(machine, code);
    }

    @Override
    public void clickInsertCoinBtn(VendingMachine machine) {
        System.out.println("invalid operation.");
    }

    @Override
    public void clickProductSelectionBtn(VendingMachine machine) {
        System.out.println("invalid operation.");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("invalid operation.");
    }

    @Override
    public int chooseProduct(VendingMachine machine, int code) {
        System.out.println("invalid operation");
        return 0;
    }

    @Override
    public int getChange(int amount) {
        System.out.println("invalid operation.");
        return 0;
    }

    @Override
    public Item dispenseItem(VendingMachine machine, int code) {
        Item item = machine.getInventoryManager().getItem(code);
        machine.getInventoryManager().updateAvailability(code);
        machine.setState(new InitialState(machine));
        return item;
    }

    @Override
    public List<Coin> refundMoney(VendingMachine machine) {
        System.out.println("invalid operation.");
        return null;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int code) {
        System.out.println("invalid operation.");
    }
}
