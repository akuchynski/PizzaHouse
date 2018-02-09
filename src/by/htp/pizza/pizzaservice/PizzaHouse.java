package by.htp.pizza.pizzaservice;

import by.htp.pizza.input.OrderInput;

public class PizzaHouse {

	OrderInput order = new OrderInput();

	public Pizza cookPizza() {
		Pizza pizza = new Pizza();
		pizza.title = order.readTitle();
		pizza.size = order.readSize();
		System.out.println("Your order is accepted!");
		if(pizza.ready == false)
		System.out.println("Pizza cooking... Please wait 5 sec.");	
		try {
			for(int i = 5; i > 0; i--){
				Thread.sleep(1000);
				System.out.println(i);	
			}
			
			} catch (InterruptedException e) {
			   e.printStackTrace();
			}
		return pizza;
	}
}
