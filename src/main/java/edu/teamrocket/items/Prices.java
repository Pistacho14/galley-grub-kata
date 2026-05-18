package edu.teamrocket.items;

import java.util.Map;
import java.util.HashMap;

public class Prices {

    private static Map<String, Double> prices = new HashMap<>();

    private Prices() {}

    public static void initPrices() {
        if (prices.isEmpty()) {
            prices.putIfAbsent("cheese", 0.25);
            prices.putIfAbsent("sauce", 0.50);
            prices.putIfAbsent("medium", 0.25);
            prices.putIfAbsent("large", 0.50);
        }
    }

    public static void display() {
        for (var extra : prices.entrySet()) {
            System.out.println(extra.getKey() + "=" + extra.getValue());
        }
    }
}
