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
		   int  b = sc.nextInt();
		    int apple = sc.nextInt();
		    int b2 = b/2;
		    if(b2>apple){ 
		        System.out.println(apple);
		    }
		    else{ 
		        System.out.println(b2);
		    }
		
		
		
		    tesst--;
		}
	}
}
