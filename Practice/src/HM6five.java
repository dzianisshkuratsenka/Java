
public class HM6five {
	public static void main(String[] args) {
		// Write a program that prints the total number of elements that are negative
		// AND odd
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
int c=0;
		for(int i=0;i<a.length;i++) {
			for(int q=0;q<a[i].length;q++) {
			if(a[i][q]%2==-1) {
				 c+=1;
			}	
			}
		}
		System.out.println(c);
	}
}
