import java.util.Scanner;

public class WendTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * /Write a program that allows a user to input age to find out if the user is
		 * either Too Young, Young Person, Middle Age Person, or too Old // Age should
		 * NOT be greater than 18 print out Too Young // Age should be between 18 and 35
		 * inclusive print out Young Person // Age should equal 36 or less than or equal
		 * to 99 inclusive print out You are Middle Age Person // If the age is greater
		 * than 100 print print out You are too Old // Create an int variable named age
		 * // Must use a Scanner
		 */

		int age;
		String a;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		if (age >= 18) { // if(!(age>=18 )) {
			a = "Too Young";
		} else if (age >= 18 && age <= 35) {
			a = "Young Person";
		} else if (age >= 36 && age <= 99) {
			a = "Middle Age Perso";
		} else if (age >= 100) {
			a = "too Old";
		} else {
			a = "Cum";
		}
		System.out.println("You are " + a);
	}

}
