package w3resource;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Write a Java method to find the smallest number among three numbers. Go to
		 * the editor Test Data: Input the first number: 25 Input the Second number: 37
		 * Input the third number: 29 Expected Output: The smallest value is 25.0
		 */
		Method1 obj = new Method1();
		int smallest = obj.getSmallest(23,20,21);
		System.out.println(smallest);
	}
public  int  getSmallest(int a, int b, int c) {
	int smallest = c;
	if(a <= b && a <= c ) smallest = a;
	if(b <= a && b <= c ) smallest = b;
	return smallest;
}
}
