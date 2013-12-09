package me.agilani.www;


//This is out actual subject implementation
//hidden from user
//we change our logic here and user just keep accessing the proxy


public class CoffeeShop implements ICoffeeShop {
	
	private CustomerOrder orderToProcess;

	@Override
	public void placeOrder(CustomerOrder order) {
		this.orderToProcess = order;
		
		double cashToGiveBack = CalculateDifference(order.getCash(), order.getCoffeePref().getValue());
		
		this.orderToProcess.setCash(cashToGiveBack);
		this.orderToProcess.setCoffeePref(order.getCoffeePref());
		
	}

	@Override
	public CustomerOrder getOrder() {
		// TODO Auto-generated method stub
		return orderToProcess;
	}

	public double CalculateDifference(double cashInput, double coffeePrice) {
		// TODO Auto-generated method stub
		return cashInput - coffeePrice;
	}
	
}
