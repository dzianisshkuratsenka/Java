
public class HM6four {
	public static void main(String[] args)
	{
		int[][] a = {
			{1,1,2}, //sum = 4
			{3,1,2}, //sum = 6
			{3,5,3}, //sum = 11
			{0,1,2}  //sum = 3
		};
		
		int [] b=new int[4];
		
		for(int i=0;i<a.length;i++) {
			for(int q=0;q<a[i].length;q++) {
				b[i]=a[i][q]+b[i];
			}
			System.out.println(b[i]);
		}
		
}
}