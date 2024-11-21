package com.jumping;
//print from 1 to 10 but stop if number is 6 
public class SimpleBreak {
//BREAK terminates the program
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==6) {
				break;
			}
			System.out.print(i+" ");
		}
	}
}
