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
		    int a=0;
		   
		    int size = sc.nextInt();
		    int num = sc.nextInt();
		    int arr[] = new int[size];
		    for(int i =0 ; i< size ; i++){ 
		        arr[i]= sc.nextInt();
		    }
		    for( int j =0 ; j<size ; j++){ 
	
		        if(arr[j]<num){ 
		            a=j+1;
		        }
		    }
		    System.out.println(a);
		    tesst--;
		}
	}
}
