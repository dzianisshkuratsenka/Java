package com.class4;

import java.util.Scanner;

public class CityAndTemperatures {
public static void main(String[] args) {
	String city;
	int temp;
	Scanner input=new Scanner(System.in);
	System.out.println("What is your city?");
	city=input.nextLine();
	System.out.println("what is temperature there in F?");
	temp=input.nextInt();
	temp = (temp-32)/2;
	System.out.printf("The temperature in %s is %s ", city,temp);
}
}
