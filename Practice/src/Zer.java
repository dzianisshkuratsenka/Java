import java.util.Scanner;

public class Zer {

	public static void main(String[] args) {
			
			    
			        /* How to conquer the world
		Write a program that reads from keyboard a name and a number and displays the text:
		    �name� will conquer the world in �number� years. Bwahaha!
		    (The sequence of input data is important.)*/

		   /* Example:
		    Joe will conquer the world in 8 years. Bwahaha!*/
			        String name;
			       int num;
			        Scanner input=new Scanner(System.in);
			        System.out.println();
			        name=input.nextLine();
			        num=input.nextInt();
	System.out.println(name+" will conquer the world in "+num+" years. Bwahaha!");
			    }
			}