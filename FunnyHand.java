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
		int test = sc.nextInt();
		while(test-->0){ 
		    int limit = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int x = a-b;
		    if(a==b){ 
		        System.out.println(0);
		    }
		    else if(Math.abs(x)==1){ 
		        if((a>1 && b>1) && (a<limit && b<limit)){ 
		            System.out.println(2);
		        }
		        else{ 
		            System.out.println(1);
		        }
		    }
		    else if(Math.abs(x)==2){ 
		        System.out.println(1);
		    }
		    else{ 
		        System.out.println(0);
		    }
		}
	}
}
