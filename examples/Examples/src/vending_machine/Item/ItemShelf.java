package vending_machine.Item;

public class ItemShelf {
    private int code;
    private Item item;
    boolean isAvailable;

    public ItemShelf(int code, Item item, boolean isAvailable) {
        this.code = code;
        this.item = item;
        this.isAvailable = isAvailable;
    }

    public ItemShelf(int code, boolean isAvailable) {
        this.code = code;
        this.isAvailable = isAvailable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
