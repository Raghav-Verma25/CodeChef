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
		    int rs = sc.nextInt();
		    int res = rs/5;
		    if(rs%5==0 && rs%10==5){ 
		        System.out.println(res/2 +1);
		    }
		    else if(rs%10==0){ 
		        System.out.println(res/2);
		    }
		    else if(rs%5!=0){
		        System.out.println("-1");
		        
		    }
		    
		    
		    
		    tesst--;
		}
	}
}
