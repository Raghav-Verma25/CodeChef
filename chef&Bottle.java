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
		int tesst = sc.nextInt();
		while(tesst!=0){ 
		    int bottle = sc.nextInt();
		    int bc = sc.nextInt();
		    int tc = sc.nextInt();

		    int res = tc/bc;
		    if(res>bottle){ 
		        System.out.println(bottle);
		    }
		    else{ 
		        System.out.println(res);
		    }
		    
		    
		    tesst--;
		}
	}
}
