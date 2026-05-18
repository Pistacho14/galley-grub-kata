package edu.teamrocket.items;

public class Item implements Product{

    private final String name;
    private final double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public void display() {
        System.out.println(this.name + "...." + this.price);
    }
}
