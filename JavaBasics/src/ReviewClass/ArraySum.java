package ReviewClass;

public class ArraySum {

	public static void main(ManSrt[] args) {
		// TODO Auto-generated method stub
int sum=0;
		int[]x=new int[10];
for(int i=0;i<10;i++) {
	x[i]=i+1;
	 sum=x[i]+sum;
}System.out.println(sum);
	}

}
