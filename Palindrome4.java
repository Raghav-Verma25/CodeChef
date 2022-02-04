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
		    int len = sc.nextInt();
		    int op = sc.nextInt();
		    String str = sc.next();
		    int c = 0;
		    int lenlast=len-1;
		    for(int i=0 ; i<len/2 ; i++){ 
		        if(str.charAt(i)!=str.charAt(lenlast)){ 
		            c=c+1;
		        }
		        lenlast--;
		    }
		    if(c<=op){ 
		        if((op-c)%2==0){ 
		           System.out.println("YES");
		       }
		       else if(len%2==1){
		           System.out.println("YES");
		           
		       }
		       else{ 
		           System.out.println("NO");
		       }
		    }
		    
		     
		    else{ 
		        System.out.println("NO");
		    }
		    
		    
		    tesst--;
		}
	}
}
