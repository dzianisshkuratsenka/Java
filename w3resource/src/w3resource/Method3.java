package w3resource;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Write a Java method to display the middle character of a string. Go to the editor
Note: a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
Test Data:
Input a string: 350 
Expected Output:
                                                                          
The middle character in the string: 5
 */
		getMidleCharacter("Dzianiska");
	}

	public static void getMidleCharacter(String str) {
    int i = str.length()/2;
    if(str.length()%2 == 1) System.out.println(str.substring(i, i+2));
    if(str.length()%2 == 0) System.out.println(str.substring(i, i+1));
    
	}
}
