package by.htp.pizza.pizzaservice;

import by.htp.pizza.input.OrderInput;

public class PizzaHouse {

	int num = 0;

	public Pizza cookPizza() {

		OrderInput order = new OrderInput();
		if (order.readOrder() == false) {
			Pizza pizza = null;
			return pizza;
		}

		num++;
		Pizza pizza = new Pizza();
		pizza.orderNum = num;
		pizza.title = order.readTitle();
		pizza.size = order.readSize();
		pizza.topings = order.readTopings();

		System.out.println("Your order is accepted!");
		System.out.println("Pizza cooking... Please wait 5 sec.");
		try {
			for (int i = 5; i > 0; i--) {
				Thread.sleep(1000);
				System.out.println(i);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return pizza;
	}
}
