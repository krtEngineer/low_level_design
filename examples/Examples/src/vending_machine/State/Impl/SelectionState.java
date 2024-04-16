package vending_machine.State.Impl;

import vending_machine.Coin.Coin;
import vending_machine.Item.Item;
import vending_machine.State.State;
import vending_machine.VendingMachine.VendingMachine;

import java.util.List;

public class SelectionState implements State {
    @Override
    public void clickInsertCoinBtn(VendingMachine machine) {
        System.out.println("invalid operation");
    }

    @Override
    public void clickProductSelectionBtn(VendingMachine machine) {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("invalid operation.");
    }

    @Override
    public int chooseProduct(VendingMachine machine, int code) {
        Item item = machine.getInventoryManager().getItem(code);
        int balance = getBalance(machine.getCoinList());
        return getSettledAmount(machine, code, item, balance);
    }

    private int getSettledAmount(VendingMachine machine, int code, Item item, int balance) {
        if (balance < item.getPrice()) {
            System.out.println("Insufficient balance.");
            refundMoney(machine);
            return balance;
        } else {
            int change = 0;
            if (balance > item.getPrice()) {
                change = getChange(balance - item.getPrice());
                System.out.println("Change of INR: " + change);
            }
            machine.setState(new DispenseState(machine, code));
            return change;
        }
    }

    private int getBalance(List<Coin> coinList) {
        int balance = 0;
        for (Coin coin : coinList) {
            balance += coin.label;
        }
        return balance;
    }

    @Override
    public int getChange(int amount) {
        return amount;
    }

    @Override
    public Item dispenseItem(VendingMachine machine, int code) {
        System.out.println("invalid operation.");
        return null;
    }

    @Override
    public List<Coin> refundMoney(VendingMachine machine) {
        machine.setState(new InitialState(machine));
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int code) {
        System.out.println("invalid operation.");
    }
}
