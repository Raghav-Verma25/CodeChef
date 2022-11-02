/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int testt = sc.nextInt();
		while(testt!=0){
		    int aa = sc.nextInt();
		    int bb = sc.nextInt();
		    int a_result = 2*aa;
		    int b_result = 5*bb;
		    if(a_result > b_result){
		        System.out.println("Chocolate");
		    }
		    else if(a_result < b_result){
		        System.out.println("Candy");
		    }
		    else{
		        System.out.println("Either");
		    }
		    
		    testt--;
		}
	}
}
