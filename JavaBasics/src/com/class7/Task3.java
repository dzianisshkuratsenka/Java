package com.class7;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ask user to pay for a soda
	     *keep asking user to pay for soda until entered price is not equal to 1.99
	     *after user got a write amount print "Please enjoy your soda"*/
		
		double userMoney;
		Scanner input=new Scanner(System.in);
		
		do {
			System.out.println("Put equal amount of money.");
		
		userMoney=input.nextDouble();
		
		}
		while(userMoney!=1.99) ;
			System.out.println("Enjoy your soda");
		}
			}
		
	


