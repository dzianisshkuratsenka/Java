package com.class17_2;

import java.util.Scanner;

import com.class18.Calculator;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Input two numbers please");
		int a=in.nextInt();
		int b=in.nextInt();
		Calculator calcu=new Calculator();
		System.out.println(calcu.sub(a, b));
		System.out.println(calcu.sum(a, b));
		System.out.println(calcu.div(a, b));
		System.out.println(calcu.mult(a, b));
		
	}

}
