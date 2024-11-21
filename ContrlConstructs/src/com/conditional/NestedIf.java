package com.conditional;
/*always print 2 digit number if user enters sing 
digit then make it 2 digit*/
import java.util.*;
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr digit");
		int digit=sc.nextInt();
		check(digit);
	}
	static void check(int digit) {
		if(digit>0&& digit<=9) {
			System.out.println("0"+digit);
		}
		if(digit>9&& digit<=99) {
			System.out.println(digit);
		}
	}

}
