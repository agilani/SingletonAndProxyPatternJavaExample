package me.agilani.www;

public class CoffeeShopProxy implements ICoffeeShop

{
	
	private static int shopID = 1; //to keep track of shop ids
	
	private static CoffeeShopProxy cs; //this is proxy
	private CoffeeShop actualCS; //this is my actual shop

	//constructor is not accesible outside of this class
	private CoffeeShopProxy(){
		actualCS = new CoffeeShop();
	} 
	
	//give an instance to the caller
	//but always the same instance
	//for thread safety add synchronized keyword
	public synchronized static CoffeeShopProxy getInstance()
	{
		if(cs==null)
		{
			cs = new CoffeeShopProxy();
		}
		return cs;
	}
	
	//a method to give the shop id
	public int getShopID()
	{
		return shopID;
	}
	
	
	//the below two methods are overriden from interface
	//you can see the methods are being deligated to the actual coffee shop instance
	
	@Override
	public void placeOrder(CustomerOrder order) {
		actualCS.placeOrder(order);
	}

	@Override
	public CustomerOrder getOrder() {
		return actualCS.getOrder();
	}
}
