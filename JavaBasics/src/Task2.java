import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*
		 * 1. Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 */
		int num1, num2;
		int sumOdd = 0;
		int sumEven = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Type number 1");
		num1 = input.nextInt();
		System.out.println("Type number 2");
		num2 = input.nextInt();

		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}

		}
		System.out.println(sumEven);
		System.out.println(sumOdd);

	}
}
