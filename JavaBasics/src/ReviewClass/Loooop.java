package ReviewClass;

public class Loooop {

	public static void main(ManSrt[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 2 3 4 5 6 7 8 9 10 2 4 6 8 10 12 14 16 18 20 3 6 9 12 15 18 21 24 27 30 4 8
		 * 12 16 20 24 28 32 36 40 5 10 15 20 25 30 35 40 45 50
		 */

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			if (i == 10) {
				System.out.println();
				System.out.print("\t\t   ");
				for (int a = 1; a <= 50; a++) {
					if (a % 2 == 0) {
						System.out.print(a + " ");
					}
				}
				if (i == 10) {
					System.out.println();
					System.out.print("\t\t   ");
					for (int b = 1; b <= 50; b++) {
						if (b % 3 == 0) {
							System.out.print(b + " ");
						}

					}
				}
				if (i == 10) {
					System.out.println();
					System.out.print("\t\t   ");
					for (int c = 1; c <= 50; c++) {
						if (c % 4 == 0) {
							System.out.print(c + " ");
						}
					}
				}
				if (i == 10) {
					System.out.println();
					System.out.print("\t\t   ");
					for (int d = 1; d <= 50; d++) {
						if (d % 5 == 0) {
							System.out.print(d + " ");
						}

					}

				}
			}
		}
	}
}