package ReviewClass;

public class ManSrt {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
/*Write a program that:
        * Converts all the characters in the string to lower case and prints.
        * Converts all the characters in the string to upper case and prints.
        * Checks whether the string/paragraph starts and ends with the string or word "The" and prints.
        * Counts the number of letter 'a' in the string/paragraph and prints.
        * Prints the second half of the string/paragraph.
        * Prints characters between the 10th and 20th indices(inclusive).
        * Prints the string/Paragraph in reverse order.
        * Clears/removes all white spaces or tabs on both ends and prints.
        */
int sum=0;

       String para = "The quick brown fox jumps over the lazy dog.";
       System.out.println(para.toLowerCase());
       System.out.println(para.length());
       System.out.println(para.toUpperCase());
       System.out.println(para.startsWith("The"));
     System.out.println(para.endsWith("The"));
       if (para.contains("a")) sum++;
       System.out.println(sum);
       System.out.println(para.substring(para.length()/2));
       System.out.println(para.substring(10,20));
       System.out.println(para.trim());
      String rev="";
      for(int i=para.length()-1;i>=0;i--) {
    	  rev=rev+para.charAt(i);
    	  
      }
	
	System.out.println((rev));
	}
}
