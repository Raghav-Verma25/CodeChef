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
		    int pqr = sc.nextInt();
		    int a1 = pqr/7;
		    int a2 = pqr%7;
		    if(a2>=6){ 
		        a1++;
		    }
		    
		    System.out.println(a1);
		    tesst--;
		}
	}
}
