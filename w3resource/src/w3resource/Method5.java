package w3resource;

public class Method5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 5. Write a Java method to count all words in a string. Go to the editor
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:
Number of words in the string: 9
 */
		String str = "The quick brown fox jumps over the lazy dog.";
		System.out.println("Number of words in the \""+str+"\": "+countWords(str));
	}
	public static int countWords(String str) {
		String [] array = str.split(" ");
		int count = array.length;
		return count;
		
	}

}
