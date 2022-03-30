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
		while(test!=0){
		    int len = sc.nextInt();
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    String str = sc.next();
		    int zero=0 , one=0;
		    String new_str="";
            for(int i=0 ; i< len ; i++ )
		    { 
		        if(str.charAt(i)=='0'){ 
		            zero++;
		        }
		        else{ 
		            one++;
		        }
		    }
		    if(zero==len || one==len){ 
		        System.out.println('0');
		    }
		    else{ 
		        if(x1>y1){ 
		            /*char ch[] = str.toCharArray();
		            Arrays.sort(ch);
		            String str2 = new String(ch);
		            for(int j=len-1 ; j>=0 ; j--){ 
		                new_str = new_str + str2.charAt(j);
		            }*/
		            System.out.println(y1);
		        }
		        else{ 
		            System.out.println(x1);
		        }
		        
		    }
		    test--;
		}
	}
}
