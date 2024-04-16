package vending_machine.VendingMachine;

import vending_machine.Coin.Coin;
import vending_machine.Inventory.InventoryManager;
import vending_machine.State.State;

import java.util.List;

public class VendingMachine {
    private State state;
    private InventoryManager inventoryManager;
    private List<Coin> coinList;

    public VendingMachine(State state, InventoryManager inventoryManager, List<Coin> coinList) {
        this.state = state;
        this.inventoryManager = inventoryManager;
        this.coinList = coinList;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public InventoryManager getInventoryManager() {
        return inventoryManager;
    }

    public void setInventoryManager(InventoryManager inventoryManager) {
        this.inventoryManager = inventoryManager;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }
}
