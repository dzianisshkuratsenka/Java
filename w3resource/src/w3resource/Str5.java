package w3resource;

public class Str5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 5. Write a java program to compare two strings lexicographically. Go to the
		 * editor
		 * 
		 * Sample Output:
		 * 
		 * String 1: This is Exercise 1 String 2: This is Exercise 2
		 * "This is Exercise 1" is less than "This is Exercise 2"
		 */
		String str1="This is Exercise 1";
		String str2="This is Exercise 2";
		
		int value=str1.compareTo(str2);
		if(str1.compareTo(str2)>0) {
			System.out.println("\"This is Exercise 1\" is greater than \"This is Exercise 2\"");
		}if(str1.compareTo(str2)<0 ){
			System.out.println("\"This is Exercise 1\" is less than \"This is Exercise 2\"");
		System.out.println(value);
		}if(str1.compareTo(str2)==0){
			System.out.println("\"This is Exercise 1\" is eual to\"This is Exercise 2\"");
	}
}
}
