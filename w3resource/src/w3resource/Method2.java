package w3resource;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Write a Java method to compute the average of three numbers. Go to the editor
Test Data:
Input the first number: 25 
Input the second number: 45
Input the third number: 65
Expected Output:
The average value is 45.0
 */
		Scanner in = new Scanner(System.in);
		System.out.println(" Input first number : ");
		double x = in.nextDouble();
		System.out.println(" Input second number : ");
		double y = in.nextDouble();
		System.out.println(" Input third number : ");
		double z = in.nextDouble();
		double avverage = getAvv(z,y,x);
		System.out.println(" Averrage is "+avverage);
		
	}
	public static double getAvv(double x, double y, double z) {
		return (x + z + y)/3;
	}

}