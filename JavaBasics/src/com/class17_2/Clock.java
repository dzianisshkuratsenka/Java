package com.class17_2;

 public class Clock {

	public static void main(String[] args) {
	Clock clock=new Clock();
	clock.clock();
		
	}
	
	void clock() {

		for (int i = 0; i < 24; i++) {
			for (int a = 0; a < 60; a++) {
				if (a < 10) {
					System.out.println(i + ":0" + a);
				} else {
					System.out.println(i + ":" + a);
				}
			}

		}
	}
	
	public int sum(int a,int b) {
		return a+b;
	}
}
