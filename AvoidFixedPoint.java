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
		    int size = sc.nextInt();
		    int arr[] = new int[size];
		    for(int i =0 ; i< size ; i++){ 
		        arr[i]=sc.nextInt();
		    }
		    int k=0;
		    int x=0;
		    for(int j =0 ; j< size ; j++){
		        x = j+k+1;
		        if(x==arr[j]){ 
		            k++;
		        }
		    }
		    System.out.println(k);
		    
		    
		    tesst--;
		}
	}
}
