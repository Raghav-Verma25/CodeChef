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
		    int n = sc.nextInt();
		    String str = sc.next();
		    int len = str.length();
		    int one=0 ;
		    int zero=0;
		    for(int i =0 ; i<len ; i++){ 
		        if(str.charAt(i)=='0'){ 
		            zero++;
		        }
		        else{
		            one++;
		        } 
		    }
            if(zero==one){ 
                System.out.println(2*one);
            }
            else{
            int res = Math.min(zero,one);
             System.out.println((2*res) +1 );
                
            }

            tesst--;
		}
	}
}
