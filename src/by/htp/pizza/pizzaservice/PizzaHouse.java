package by.htp.pizza.pizzaservice;

import by.htp.pizza.input.OrderInput;

public class PizzaHouse {

	OrderInput order = new OrderInput();

	public Pizza cookPizza() {
		Pizza pizza = new Pizza();
		pizza.title = order.readTitle();
		pizza.size = order.readSize();
		return pizza;
	}
}
