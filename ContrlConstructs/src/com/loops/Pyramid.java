package com.loops;
import java.util.*; //importing package which consists scanner class
public class Pyramid {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in); //creating object to scanner class
		System.out.println("Enter pattern size");
		int n=scan.nextInt(); // taking input from the user
		//using simple for-loop
		for(int i=1;i<=n;i++) { //for-loop for number of times of iteration
			for(int j=1;j<=i;j++) { //for-loop to print no. of stars
			System.out.print("*");  
		}//end of j
			System.out.println(); //new line
	  } //end of i		
	}
}
