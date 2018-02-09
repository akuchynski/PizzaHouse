package by.htp.pizza.runner;

import by.htp.pizza.pizzaservice.Pizza;
import by.htp.pizza.pizzaservice.PizzaHouse;

public class MainApp {

	public static void main(String[] args) {

		PizzaHouse phouse = new PizzaHouse();
		
		Pizza pizza1 = phouse.cookPizza();
		
		System.out.println("Your order is ready: " + pizza1.title + " " + pizza1.size);

	}

}
