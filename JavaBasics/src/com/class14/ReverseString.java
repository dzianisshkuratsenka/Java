package com.class14;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Reverse a String without using a reverse function
        // 1 using toCharArray();
        String original="Today is Java Class";
        String reverse="";
        
        char[] array=original.toCharArray();
        for (int i=array.length-1; i>=0; i--) {
            reverse=reverse+array[i];
        }
        System.out.println("Reversed String is: "+reverse);
        // 2 using charAt()
        String reverse1="";
        
        for(int i=original.length()-1; i>=0; i--) {
            reverse1=reverse1+original.charAt(i);
        }
        System.out.println("Reversed String is: "+reverse1);
        // using substring()

String a="Today is Java Class";
String b="";
for(int i=a.length()-1;i>=0;i--){
	b+=a.substring(i,i+1);
}
System.out.println(b);
	}

}
