package me.agilani.www;

public class Runner {

	public static void main(String[] args) {
	
		CustomerOrder order = new CustomerOrder(5, CoffeeTypes.Americano);
		CustomerOrder order2 = new CustomerOrder(10, CoffeeTypes.Chocolate);
		
		CoffeeShopProxy csp = CoffeeShopProxy.getInstance();
		
		System.out.println("Customer handed in €" + order.getCash() + " and  Ordered " + order.getCoffeePref() + " in Shop # " + csp.getShopID() + " which costed him €" + order.getCoffeePref().getValue());
		
		csp.placeOrder(order);
		
		order = csp.getOrder();
		
		System.out.println("Customer got €" + order.getCash() + " in change and a " + order.getCoffeePref() + " in Shop # " + csp.getShopID());
		
		
		
		
		CoffeeShopProxy csp1 = CoffeeShopProxy.getInstance();
		
		System.out.println("Then Customer handed in €" + order2.getCash() + " and  Ordered " + order2.getCoffeePref() + " in Shop # " + csp1.getShopID() + " which costed him €" + order2.getCoffeePref().getValue());
		
		csp1.placeOrder(order2);
		
		order = csp1.getOrder();
		
		System.out.println("Customer got €" + order2.getCash() + " in change and a " + order2.getCoffeePref() + " in Shop # " + csp1.getShopID());
	}

}
