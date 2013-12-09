package me.agilani.www;

public enum CoffeeTypes {
	Americano(2), Latte(3), White(2), Chocolate(3);
	

    private final int id;
    CoffeeTypes(int id) { this.id = id; }
    public int getValue() { return id; }
}
