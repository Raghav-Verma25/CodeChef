import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int test = sc.nextInt();
	while(test-->0){ 
	    
	    long arr[] = new long[4];
	    int i;
	    for(i =0 ; i<4 ; i++) 
	        arr[i] = sc.nextLong();
	    Arrays.sort(arr);
	    double a11 = (double)(arr[2]+arr[0])/2;
	    double b1 = arr[2]-a11;
	    double a2 = (double)(arr[2]+arr[1])/2;
	    double b2 = arr[2]-a2;
	    double a3 = (double)(arr[3]+arr[0])/2;
	    double b3 = arr[3]-a3;
	    double a4 = (double)(arr[3]+arr[1])/2;
	    double b4=arr[3]-a4;
	    if((a11%1==0)&&(a11!=0)&&(b1%1==0)&&(b1!=0)){ 
	        if(((int)(a11/b1) ==(double)arr[1]) && (a11*b1==(double)arr[3])&&(a11>=1)&& (b1>=1)&&(a11<=10000)&&(b1<=10000)){ 
	            System.out.println((long)a11+ " "+(long)b1);
	            continue;
	        }
	    }
	     if((a2%1==0)&&(a2!=0)&&(b2%1==0)&&(b2!=0)){ 
	        if(((long)(a2/b2) ==(double)arr[0]) && (a2*b2==(double)arr[3])&& (a2>=1)&&(b2>=1)&&(a2<=10000)&&(b2<=10000)){ 
	            System.out.println((long)a2+ " "+(long)b2);
	            continue;
	        }
	    }
	     if((a3%1==0)&&(a3!=0)&&(b3%1==0)&&(b3!=0)){ 
	        if(((long)(a3/b3) ==(double)arr[1]) && (a3*b3==(double)arr[2])&& (a3>=1)&&(b3>=1)&&(a3<=10000)&&(b3<=10000)){ 
	            System.out.println((long)a3+ " "+(long)b3);
	            continue;
	        }
	    }
	     if((a4%1==0)&&(a4!=0)&&(b4%1==0)&&(b4!=0)){ 
	        if(((long)(a4/b4) ==(double)arr[0]) && (a4*b4==(double)arr[2])&& (a4>=1)&&(b4>=1)&&(a4<=10000)&&(b4<=10000)){ 
	            System.out.println((long)a4+ " "+(long)b4);
	            continue;
	        }
	    }
	    System.out.println("-1 -1");
	   
	}
		
	}
}
