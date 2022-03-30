/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int min(int[] arr){
    int a =arr[0];
    for(int i =0 ; i<arr.length ; i++){
        if(arr[i]<a){ 
            a=arr[i];
        }
    } 
    return a;
    }
    static int count(int arr[] , int x){ 
        int co =0;
        for(int i =0 ; i<arr.length ; i++){ 
            if(arr[i]==x){ 
                co++;
            }
        }
        return co++;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test!=0){
		    int n1 = sc.nextInt();
		    int k = sc.nextInt();
		    int arr[] = new int[n1];
		    for(int j =0 ; j<n1 ; j++){ 
		        arr[j]= sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int m = arr[n1-1];
		    if(k>=n1-1){ 
		        System.out.println(m);
		    }
		    else if(k==0){ 
		        System.out.println(min(arr));
		    }
		    else if(count(arr,min(arr)) > k){ 
		        System.out.println(min(arr));
		    }
		    else{ 
		        System.out.println(arr[k]);
		    }
		    
		    
		    
		    test--;
		}
	}
}
