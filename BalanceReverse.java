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
		    String b = sc.next();
		    char ch[] = b.toCharArray();
		    Arrays.sort(ch);
		    System.out.println(new String(ch));
		    
		    
		    tesst--;
		}
	}
}
