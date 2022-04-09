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
		Scanner s = new Scanner(System.in);
		long test = s.nextLong();
		while(test!=0){ 
		    long num11 = s.nextLong();
		    if(num11%4==3 || num11%4==2){ 
		        System.out.println("3");
		    }
		    else if(num11%4==0){ 
		        System.out.println(3+num11);
		    }
		    else if(num11%4==1){ 
		        System.out.println(num11);
		    }
		    test--;
		}
		
	}
}
