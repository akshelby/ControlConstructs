package com.loops;
import java.util.*;
public class SimpleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		display(n);
	}
	static void display(int n) {
		int i=1;
		do {
			System.out.print(i+" ");
			i++;
		}
		while(i<=n);
	}

}
