package w3resource;

public class Str3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3. Write a Java program to get the character (Unicode code point) before the
		 * specified index within the String. Go to the editor
		 * 
		 * Sample Output:
		 * 
		 * Original String : w3resource.com Character(unicode point) = 119
		 * Character(unicode point) = 99
		 */
		String str="w3resource.com";
		int index =str.codePointBefore(1);
		int index1 =str.codePointBefore(9);
		System.out.println("Character(unicod point)="+index);
		System.out.println("Character(unicod point)="+index1 );
		
	}

}
