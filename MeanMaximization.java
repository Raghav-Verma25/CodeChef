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
		    int arr[] = new int[len];
		    for(int i =0 ; i<len ; i++){ 
		        arr[i] = sc.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    int P[]= new int[len-1];
		    int Q [] = new int[1];
		    Q[0] = arr[len-1];
		    float sum=0;
		    for(int j =0 ; j<len-1 ; j++){ 
		         P[j] = arr[j];
		        sum = sum +P[j];
		    }
		    float avg = sum / (len-1);
		    float mean = avg + Q[0];
		    float result = mean;
		    //System.out.print(result);
		    System.out.printf("%.6f",result);
		    System.out.println();
		    
		    
		    
		    
		    tesst=tesst-1;
		}
	}
}
