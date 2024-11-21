package com.loops;
//printing numbers from 1 to 5
import java.util.*;
public class SimpleForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int n=scan.nextInt();
		display(n);
	}
	static void display(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
	}

}
