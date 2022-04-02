/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int checksum(int n){ 
        int sum=0 , rem=0;
        while(n>0){ 
            rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0){ 
		    int n = sc.nextInt();
		    int sum = checksum(n);
		    if(sum%2==0){ 
		        while(sum%2==0){ 
		            n=n+1;
		            sum = checksum(n);
		        }
		        System.out.println(n);
		    }
		   else{
		       while(sum%2==1){ 
		           n=n+1;
		           sum = checksum(n);
		       }
		       System.out.println(n);
		   }
		    
		    
		   
		}
	}
}
