package com.class12;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] products = { "fruits", "veggies", "dairy" };
		String[][] typeOfProducts = {

				{ "banana", "pamela", "peach", "apple", "kiwi" }, { "tomato", "cucamber", "carrot", "onion", "garlic" },
				{ "milk", "cheese", "catton cheese", "sour cream" } };

		for (int r = 0; r < typeOfProducts.length; r++) {
			for (int i = r; i == r; i++) {
				System.out.println("\n" + products[i] + ":");

				for (int c = 0; c < typeOfProducts[r].length; c++) {
					System.out.print(typeOfProducts[r][c] + " ");

				}
			}
		}
		for(String[] pro:typeOfProducts) {
			System.out.println();
			for(String duct:pro) {
				System.out.print(duct+" ");
			}
			
		}
	}

}
