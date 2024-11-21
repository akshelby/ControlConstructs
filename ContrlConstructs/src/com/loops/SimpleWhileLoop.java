package com.loops;
import java.util.*;
public class SimpleWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
			System.out.println("Enter number");
			int n=sc.nextInt();
			display(n);
		}
		static void display(int n) {
			int i=1;
			while(i<=n) {
				System.out.print(i+" ");
				i++;
			}
			
		}

	}
