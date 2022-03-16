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
		    int len = sc.nextInt();
		    String str = sc.next();
		    
		    char ch[] = str.toCharArray();
		    char ch2[] = new char[len];
		    for(int i =0 ; i< len ; i++){ 
		        ch2[i] = ch[i]; 
		    }
		    Arrays.sort(ch);
		    for(int i =0 ; i<len ; i++){ 
		        if(ch2[i]!=ch[i]){ 
		            char a = ch2[i];
		            ch2[i]= ch2[len-1-i];
		            ch2[len-1-i]=a;
		        }
		    }
		    String s4 = new String(ch);
		    String s5 = new String(ch2);
		    if(s4.equals(s5)){ 
		        System.out.println("yes");
		    }
		    else{ 
		        System.out.println("no");
		    }
		    
		    
		    tesst--;
		}
	}
}
