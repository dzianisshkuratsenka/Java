package ReviewClass;

public class loo {

	public static void main(ManSrt[] args) {
		// TODO Auto-generated method stub
		/*
		 * * Write a program to produce the following pattern
		 *
		 * ....1 ...2. ..3.. .4... 5....
		 */

		for (int i = 1; i <= 5; i++) {
			for (int a = 5; a > 0; a--) {

				if (a == i) {
					System.out.print(i);
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}

	}

}
