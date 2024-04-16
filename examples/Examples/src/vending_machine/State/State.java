package vending_machine.State;

import vending_machine.Coin.Coin;
import vending_machine.Item.Item;
import vending_machine.VendingMachine.VendingMachine;

import java.util.List;

public interface State {
    public void clickInsertCoinBtn(VendingMachine machine);

    public void clickProductSelectionBtn(VendingMachine machine);

    public void insertCoin(VendingMachine machine, Coin coin);

    public int chooseProduct(VendingMachine machine, int code);

    public int getChange(int amount);

    public Item dispenseItem(VendingMachine machine, int code);

    public List<Coin> refundMoney(VendingMachine machine);

    public void updateInventory(VendingMachine machine, Item item, int code);
}
