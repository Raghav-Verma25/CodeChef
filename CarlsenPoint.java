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
		    int x = sc.nextInt();
		    String s = sc.next();
		    int len = s.length();
		    int car=0;
		    int chef=0;
		    int draw=0;
		    for(int i =0 ; i < s.length() ; i++){ 
		        if(s.charAt(i)=='C'){ 
		            car++;
		        }
		        else if(s.charAt(i)=='N'){ 
		            chef++;
		        }
		        else if(s.charAt(i)=='D'){ 
		            draw++;
		        }
		    }
		    int car_point = (car*2) + (draw*2);
		    int chef_point = (chef*2)+(draw*2);
		    if(car_point==chef_point){ 
		        System.out.println(55*x);
		    }
		   else if(car_point>chef_point){ 
		        System.out.println(60*x);
		    }
		    else if(car_point<chef_point){ 
		        System.out.println(40*x);
		    }
		    
		    
		    tesst--;
		}
	}
}
