package vending_machine.Coin;

import java.util.Arrays;

public enum Coin {
    INR_1(1),
    INR_2(2),
    INR_5(5),
    INR_10(10);

    public int label;

    private Coin(int label) {
        this.label = label;
    }

    public Coin get(int label) {
        return Arrays.stream(Coin.values()).
                filter(coin -> coin.label == label).
                findFirst().orElse(null);
    }
}
