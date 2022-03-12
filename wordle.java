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
		    String str1 = sc.next();
		    String str2 = sc.next();
		    String str = "";
		    for(int i =0 ; i< str1.length() ; i++){ 
		        if(str1.charAt(i)!=str2.charAt(i)){ 
		            str = str +"B";
		        }
		        else{ 
		            str=str+"G";
		        }
		    }
		    
		    System.out.println(str);
		    tesst--;
		}
	}
}
