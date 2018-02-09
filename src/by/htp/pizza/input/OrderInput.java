package by.htp.pizza.input;

import java.util.Scanner;

public class OrderInput {

	public boolean readOrder() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Do you want to order pizza?");
		System.out.println("Enter 1 - Yes, 2 – No");
		int value = scn.nextInt();

		boolean result = false;
		if (value == 1)
			result = true;
		return result;
	}

	public String readTitle() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please, enter number to choose the type of pizza:");
		System.out.println("Enter 1 - '4 seasons', 2 – 'Italy', 3 – 'Margherita'");
		int value = scn.nextInt();

		String result = "";
		switch (value) {
		case 1:
			result = "4 seasons";
			break;
		case 2:
			result = "Italy";
			break;
		case 3:
			result = "Margherita";
			break;
		}
		return result;
	}

	public int readSize() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number to choose the size:");
		System.out.println("Enter 1 - 24cm, 2 – 36cm, 3 – 42cm");
		int value = scn.nextInt();

		int result = 0;
		switch (value) {
		case 1:
			result = 24;
			break;
		case 2:
			result = 36;
			break;
		case 3:
			result = 42;
			break;
		}
		return result;
	}

	public String readTopings() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number to choose additional toppings:");
		System.out.println("Enter 1 - double cheese, 2 – double pepper, 3 – double ketchup");
		int value = scn.nextInt();

		String result = "";
		switch (value) {
		case 1:
			result = "double cheese";
			break;
		case 2:
			result = "double pepper";
			break;
		case 3:
			result = "double ketchup";
			break;
		}
		return result;
	}

}
