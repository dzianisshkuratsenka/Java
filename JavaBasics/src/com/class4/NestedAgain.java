package com.class4;

public class NestedAgain {
public static void main(String[] args) {
	double gpa=3.3;
	double expectedGpa=3.5;
	boolean hasDiploma=true;
	if(hasDiploma==true) {
		System.out.println("Congrats");
		if(gpa>=expectedGpa) {
			System.out.println(" U r hired");
		}else {
			System.out.println("Your gpa is not enogh");
		}
	}else {
		System.out.println("Plese get your degree");
	}
}
}
