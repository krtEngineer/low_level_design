package vending_machine.State.Impl;

import vending_machine.Coin.Coin;
import vending_machine.Item.Item;
import vending_machine.State.State;
import vending_machine.VendingMachine.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class InitialState implements State {
    public InitialState(VendingMachine machine) {
        System.out.println("Machine is in initial stage.");
        machine.setCoinList(new ArrayList<>());
    }

    public InitialState() {
        System.out.println("initial state.");
    }

    @Override
    public void clickInsertCoinBtn(VendingMachine machine) {
        machine.setState(new HasMoneyState());
    }

    @Override
    public void clickProductSelectionBtn(VendingMachine machine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("Invalid operation");
    }

    @Override
    public int chooseProduct(VendingMachine machine, int code) {
        System.out.println("Invalid operation");
        return 0;
    }

    @Override
    public int getChange(int amount) {
        System.out.println("Invalid operation");
        return 0;
    }

    @Override
    public Item dispenseItem(VendingMachine machine, int code) {
        System.out.println("Invalid operation");
        return null;
    }

    @Override
    public List<Coin> refundMoney(VendingMachine machine) {
        System.out.println("Invalid operation");
        return null;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int code) {
        machine.getInventoryManager().addItem(item, code);
    }
}
