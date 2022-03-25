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
		Scanner sc = new Scanner (System.in);
		int test = sc.nextInt();
		while(test!=0){ 
		    int a = sc.nextInt();
		    int a2= sc.nextInt();
		    int x = sc.nextInt();
		    int x2 = sc.nextInt();
		    int win =0;
		    if(a==x ){ 
		        win = win+1;
		    }
		    if(a==x2){ 
		        win = win+1;
		    }
		    if(a2==x){
		        win = win+1;
		    }
		    if(a2==x2){
		        win = win+1;
		    }
		    int res = win-2;

		  System.out.println(Math.abs(res));
		    
		    test--;
		}
	}
}
