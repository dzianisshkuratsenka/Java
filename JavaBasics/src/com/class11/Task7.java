package com.class11;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [][] cars= {
		{"Ford","Buick","Mustang"},
		{"BMW","Mercedec","Opel"},
		{"DEO"},
		{"Ferrari","Lamborgini","Mozerati"}
};
for(int r=0;r<cars.length;r++) {
	for(int c=0;c<cars[r].length;c++) {
		System.out.print(cars[r][c]+" ");
	}
	System.out.println();
}
	}

}