package com.loops;

public class LabelledForLoop {

	public static void main(String[] args) {
		a://labelling 1st for loop
			for(int i=1;i<=15;i++){
				b://labelling 2nd for loop
					for(int j=1;j<=10;j++){
						if(i==2) {//adding condition for i to iterate one-time only
							break a; //breaking second for-loop to loop only once 
						}//end of if
						System.err.println(j); //printing j value
					}//end of j
			}//end of i
	}

}
