package com.foodcafe;

import java.util.InputMismatchException;
import java.util.Scanner;

class FoodItems {

	int cheeseBurger = 150;
	int masalaMaggi = 120;
	int paneerPizza = 150;
	int italianPasta = 250;
	int chilliManchurian = 100;
	int vegitableWrap = 100;
	int margherittaPizza = 250;
	int indianPasta = 180;
	int virginMojito = 180;
	int coldCoffee = 120;
	int iceTea = 80;
	int fruitPunch = 120;
	int hotCoffee = 100;

	int choice;
	int quantity;
	static int total;
	String again;

	Scanner scan = new Scanner(System.in);

	public void displayMenu() {
		System.out.println("*******************Welcome to FoodCourt******************");
		System.out.println("=========================================================\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Something went wrong.");
		}
		System.out.println("                      Food Items");
		System.out.println("=========================================================");
		System.out.println("1.      Cheese Burger       150/-");
		System.out.println("2.      Masala Maggi        120/-");
		System.out.println("3.      Paneer Pizza        150/-");
		System.out.println("4.      Italian Pasta       250/-");
		System.out.println("5.      Chilli Manchurian   100/-");
		System.out.println("6.      Vegitable Wrap      100/-");
		System.out.println("7.      Margheritta Pizza   250/-");
		System.out.println("8.      Indian Pasta        180/-");

		System.out.println("\n                      Beverages");
		System.out.println("=========================================================");
		System.out.println("9.      Cold Coffee          120/-");
		System.out.println("10.     Iced Tea             80/-");
		System.out.println("11.     Virgin Mojito        180/-");
		System.out.println("12.     Fruit Punch          120/-");
		System.out.println("13.     Hot Coffee           100/-\n");
		System.out.println("0.     Exit");
		System.out.println("=========================================================\n");
		System.out.println("What you want to order today??\n");
	}

	public void generateBill() {
            System.out.println();
            System.out.println("*****************Thank you for ordering*******************");
            System.out.println("  Your bill is : "+total);
            System.out.println("=========================================================\n");
	}

	public void order() {
		while (true) {
			System.out.println("Select your choice.");
			try {
				choice = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please select valid option.");
			}

			switch (choice) {
			case 1:
				System.out.println("You have selected Cheese Burger.");
				System.out.println("\nPlease enter quantity.");
				try {
					quantity = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter valid quantity.");
				}
				total = total + quantity * cheeseBurger;
				break;

			case 2:
				System.out.println("You have selected Masala Maggi.");
				System.out.println("\nPlease enter quantity.");
				try {
					quantity = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter valid quantity.");
				}
				total = total + quantity * masalaMaggi;
				break;

			case 3:
				System.out.println("You have selected Paneer Pizza.");
				System.out.println("\nPlease enter quantity.");
				try {
					quantity = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter valid quantity.");
				}
				total = total + quantity * paneerPizza;
				break;

			case 4:
				System.out.println("You have selected Italian Pasta.");
				System.out.println("\nPlease enter quantity.");
				try {
					quantity = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter valid quantity.");
				}
				total = total + quantity * italianPasta;
				break;

			case 5:
				System.out.println("You have selected Chilli Manchurian.");
				System.out.println("\nPlease enter quantity.");
				try {
					quantity = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter valid quantity.");
				}
				total = total + quantity * chilliManchurian;
				break;

			case 6:
				System.out.println("You have selected Vegitable Wrap.");
				System.out.println("\nPlease enter quantity.");
				try {
					quantity = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter valid quantity.");
				}
				total = total + quantity * vegitableWrap;
				break;

			case 7:
				System.out.println("You have selected Margheritta Pizzq.");
				System.out.println("\nPlease enter quantity.");
				try {
					quantity = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter valid quantity.");
				}
				total = total + quantity * margherittaPizza;
				break;

			case 8:
				System.out.println("You have selected cheese Indian Pasta.");
				System.out.println("\nPlease enter quantity.");
				try {
					quantity = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter valid quantity.");
				}
				total = total + quantity * indianPasta;
				break;

			case 9:
				System.out.println("You have selected Cold Coffee.");
				System.out.println("\nPlease enter quantity.");
				try {
					quantity = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter valid quantity.");
				}
				total = total + quantity * coldCoffee;
				break;

			case 10:
				System.out.println("You have selected Iced Tea.");
				System.out.println("\nPlease enter quantity.");
				try {
					quantity = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter valid quantity.");
				}
				total = total + quantity * iceTea;
				break;

			case 11:
				System.out.println("You have selected Virgin Mojito.");
				System.out.println("\nPlease enter quantity.");
				try {
					quantity = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter valid quantity.");
				}
				total = total + quantity * virginMojito;
				break;

			case 12:
				System.out.println("You have selected Fruit Punch.");
				System.out.println("\nPlease enter quantity.");
				try {
					quantity = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter valid quantity.");
				}
				total = total + quantity * fruitPunch;
				break;

			case 13:
				System.out.println("You have selected Hot Coffee.");
				System.out.println("\nPlease enter quantity.");
				try {
					quantity = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter valid quantity.");
				}
				total = total + quantity * hotCoffee;
				break;

			case 0:
				System.out.println("=========================================================");
				System.out.println("         Thanks for coming! Have a nice day.");
				System.out.println("        ************Good Bye****************");
				System.out.println("=========================================================");
				System.exit(0);
				break;

			default:
				System.out.println("Please enter valid option");
				break;
			}
			System.out.print("\nDo you wish to order anything else (Y/N):  ");
			again = scan.next();
			System.out.println();
			if (again.equalsIgnoreCase("Y")) {
				order();
			}else if(again.equalsIgnoreCase("N")) {
				generateBill();
				System.exit(1);
			}else {
				System.out.println("Invalid choice.");
			}
		}
	}
}
