package me.agilani.www;

public class CustomerOrder {
	
	private double cash;
	private CoffeeTypes coffeePref;
	
	public CustomerOrder(double cash, CoffeeTypes coffeePref)
	{
		this.setCash(cash);
		this.setCoffeePref(coffeePref);
	}


	public CoffeeTypes getCoffeePref() {
		return coffeePref;
	}

	public void setCoffeePref(CoffeeTypes coffeePref) {
		this.coffeePref = coffeePref;
	}


	public double getCash() {
		return cash;
	}


	public void setCash(double cash) {
		this.cash = cash;
	}

}
