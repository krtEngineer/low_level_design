package vending_machine.State.Impl;

import vending_machine.Coin.Coin;
import vending_machine.Item.Item;
import vending_machine.State.State;
import vending_machine.VendingMachine.VendingMachine;

import java.util.List;

public class HasMoneyState implements State {
    public HasMoneyState() {
        System.out.println("Has money state");
    }

    @Override
    public void clickInsertCoinBtn(VendingMachine machine) {
        return;
    }

    @Override
    public void clickProductSelectionBtn(VendingMachine machine) {
        machine.setState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("Accepted the coin");
        machine.getCoinList().add(coin);
    }

    @Override
    public int chooseProduct(VendingMachine machine, int code) {
        System.out.println("click on production selection btn first.");
        return 0;
    }

    @Override
    public int getChange(int amount) {
        System.out.println("invalid operation.");
        return 0;
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
        System.out.println("invalid operation");
    }
}
