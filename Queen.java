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
		    int num = sc.nextInt();
		    float ans = (float)(0.143*num);
		    float res = (float)Math.pow(ans,num);
		    System.out.println((int)Math.round(res));
		    tesst--;
		}
	}
}
