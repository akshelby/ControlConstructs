package com.conditional;
//print even if user enters even number
import java.util.*;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		check(a);
		
	}
             static void check(int a) {
		      if(a%2==0) {
		    	  System.out.println("number is even");
		      }
		
	}

}
