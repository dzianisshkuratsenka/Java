package w3resource;

public class Str6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*6. Write a java program to compare two strings lexicographically, ignoring case differences. Go to the editor

Sample Output:

String 1: This is exercise 1                                                                                  
String 2: This is Exercise 1                                                                                  
"This is exercise 1" is equal to "This is Exercise 1"*/
		
		
		String str1="String 1: This is exercise 1";
		String str2="String 1: This is exercise 1";
		int value=str1.compareToIgnoreCase(str2);
		if(value>0) {
			System.out.println(value);
		}if(value<0) {
			System.out.println(value);
		}else {
			System.out.println(value);
		}
	}

}