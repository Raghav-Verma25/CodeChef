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
		while(tesst !=0){ 
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    if(y1==0){ 
		        System.out.println(x1);
		    }
		    else if(x1==y1){ 
		        System.out.println((2*x1)-1);
		    }
		    else{ 
		        System.out.println(x1+y1);
		    }
		    
		    
		    
		    tesst=tesst-1;
		}
	}
}
