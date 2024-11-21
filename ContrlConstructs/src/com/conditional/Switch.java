package com.conditional;

/*print corresponding english words for the number entered, take
int number from 1 to 5 from the user.*/
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number from 1 to 5");
        int number=sc.nextInt();
        display(number); 
	}
	static void display(int number) {
          switch(number) {
          case 1:System.out.println("ONE");
          break;
          case 2:System.out.println("TWO");
          break;
          case 3:System.out.println("THREE");
          break;
          case 4:System.out.println("FOUR");
          break;
          case 5:System.out.println("FIVE");
          break;
          default:System.out.println("invalid number");
        
        }
	}

}
