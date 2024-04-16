package vending_machine.Inventory;

import vending_machine.Item.Item;
import vending_machine.Item.ItemShelf;

public class InventoryManager {
    ItemShelf[] inventory = null;

    public InventoryManager(int itemCount) {
        this.inventory = new ItemShelf[itemCount];
        initEmptyInventory();
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public void initEmptyInventory() {
        int code = 101;
        for (int i = 0; i < inventory.length; i++) {
            ItemShelf shelf = new ItemShelf(code, true);
            inventory[i] = shelf;
            code++;
        }
    }

    public void addItem(Item item, int code) {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getCode() == code) {
                if (!itemShelf.isAvailable()) {
                    itemShelf.setItem(item);
                    itemShelf.setAvailable(true);
                } else {
                    System.out.println("Item already available at code: " + code);
                }
            }
        }
    }

    public Item getItem(int code) {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getCode() == code) {
                return itemShelf.getItem();
            }
        }
        return null;
    }

    public void updateAvailability(int code) {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getCode() == code) {
                itemShelf.setAvailable(false);
            }
        }
    }
}
