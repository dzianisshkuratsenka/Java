package com.class11;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] region= {"North America","South America","Europe","Asia","Africa"};

String [][] cntr= {
		{"Usa","Mexico","Canada"},
		{"Brazil","Argentina","Venezuela","Colombia"},
		{"Belarus","Germany","Spain","Ukraine"},
		{"China","Japan","North Korea","South Korea"},
		{"Egypt","Mali","Senegal","Niger"}
};
for(int r=0;r<cntr.length;r++) {
	System.out.print(region[r]+" : "+"\n");
	for(int c=0;c<cntr[r].length;c++) {
		System.out.print(cntr[r][c]+" ");
	}
	System.out.println();
}

	}

}
