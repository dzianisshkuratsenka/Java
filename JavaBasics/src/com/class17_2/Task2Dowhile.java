package com.class17_2;

import java.util.Scanner;

public class Task2Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Ask user to enter the item they want to buy and the price for the item.
		 * Then ask user to pay for it. Every time user enters money accumulate the
		 * amount and tell user how much is left to pay off the amount. Whenever user
		 * done with payments tell them "Thank you for shopping!"
		 */
		
		double need  =  0;
		double change = 0;
		double payment ;

		Scanner in = new Scanner(System.in);
		System.out.println("What do you wanna buy?");
		String item = in.nextLine();
		System.out.println("What is the price?");
		double price = in.nextDouble();
		System.out.println("Please pay for it.");
	    payment = in.nextDouble();
		do {
			if (payment == price) break;
		    need = price - payment;
			System.out.println("Sorry you need " + need + "$");
			System.out.println("Add more cash please");
			double more1 = in.nextDouble();
			payment += more1;
			
			if (payment > price) {
				change = price - payment;
				System.out.println("Yor change is " + change + "$");
				break;
			}
		}while(payment!=price);
		System.out.println("Thank you for shopping!");
	}
	}

