import java.util.Scanner;

public class Looop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fratorial ;
		int s=1;
		Scanner in =new Scanner(System.in);
		System.out.println("Write your number");
		fratorial=in.nextInt();
		for (int i=fratorial;i>=1;i--) {      //for (int i=1;i<=1fratorial;i++) 
			
		
			s*=i;
		}
		System.out.println("is "+s);
		
		
		
		
		
		
		/*int a;
		Scanner in =new Scanner(System.in);
		System.out.println("Input positive number");
		a=in.nextInt();
		System.out.println("The multiplication table of "+a+" is");
		for(int i=1;i<=10;i++) {
			
			System.out.println(a+"*"+i+"="+a*i);
		}*/
		/*int sum=0;
		for(int a=1;a<=10;a++) {
			
			 sum+=a;
			
			
		}
		
		System.out.println(sum);*/
		
/*int a;
for(a=1;a<=10;++a) {
	System.out.println(a);
}*/
	}

}
