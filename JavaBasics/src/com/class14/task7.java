package com.class14;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Write a java program to check whether a given number is prime or not? */
		int c = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("write a number");
		int num = in.nextInt();

		for (int i = 2; i < num; i++) {
			if (num%i == 0)
				c++;
		}
		if (c == 0) {
			System.out.println(num + " is prime");

		} else {
			System.out.println(num + " is  not prime");

		}

	}
}
