package com.class12;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]arr= {
		{1,2,3},
		{10,20,30},
		{100,200,300}
		
};
for(int []singleArray:arr) {
	for(int numbers:singleArray){
		System.out.print(numbers+" ");
		
}
	System.out.println();
}


/*for (int r=0;r<arr.length;r++) {
	for(int c=0;c<arr[r].length;c++) {
		System.out.println(arr[r][c]+" ");
	}
}*/
	}

}