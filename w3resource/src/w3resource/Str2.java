package w3resource;

public class Str2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Write a Java program to get the character (Unicode code point) at the
		 * given index within the String. Go to the editor
		 * 
		 * Sample Output:
		 * 
		 * Original String : w3resource.com Character(unicode point) = 51
		 * Character(unicode point) = 101
		 */
		
		String str="w3resource.com";
		int index=str.codePointAt(1);
		int index9=str.codePointAt(9);
				System.out.println(index);
		System.out.println(index9);
	}

}
