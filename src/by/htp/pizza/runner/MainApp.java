package by.htp.pizza.runner;

import by.htp.pizza.pizzaservice.Pizza;
import by.htp.pizza.pizzaservice.PizzaHouse;

public class MainApp {

	public static void main(String[] args) {

		PizzaHouse phouse = new PizzaHouse();

		while (true) {
			Pizza pizza = phouse.cookPizza();
			if (pizza == null) {
				System.out.println("Goodbye!");
				break;
			}

			System.out.println("Your order #" + pizza.orderNum + " is ready: " + pizza.title + "/" + pizza.size + "/"
					+ pizza.topings + "\n");
		}

	}

}
