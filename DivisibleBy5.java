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
		int test= sc.nextInt();
		while(test!=0){ 
		    int len = sc.nextInt();
		    String num = sc.next();
		    boolean res = num.contains("0");
		    boolean res2 = num.contains("5");
		    if(res==true || res2==true){ 
		        System.out.println("Yes");
		    }
		    else{ 
		        System.out.println("NO");
		    }
		    
		    test--;
		}
		
	}
}
