package com.class10;

public class QQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=7;i++) {
	for(int k=1;k<=7;k++) {

		if (i == 1 || i == 7) {

			if (k == 4) {
				System.out.print(" "+i);
			}

		}
		if (i == 2 || i == 6) {
			if (k == 3 || k == 5) {
				System.out.print(i);
			}
		}
		if (i == 3 || i == 5) {
			if (k == 2 || k == 4 || k == 6) {
				System.out.print(i);
			}
		}
		if (i == 4) {
			if (k!=2||k!=4||k!=6) {
				System.out.print(i);
			}
		}
System.out.print(" ");
	}
	System.out.println();

}
	}

}
