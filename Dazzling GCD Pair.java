import java.util.*;
class Codechef
{
 public static void main (String[] args) throws java.lang.Exception
 {
  // your code goes here
  Scanner sc = new Scanner(System.in);
  int test=sc.nextInt();
  while(test-->0){
      int a1=sc.nextInt();
      int b=sc.nextInt();
     // int x=a,y=a+1;
      int gcd=-1;
      if(a1%2==0){
          if((a1+2)<=b){
              System.out.print(a1);
              System.out.print(" ");
              System.out.println(a1+2);
          }
          else{
              System.out.println(gcd);
          }
      }
      else if(a1%3==0){
          if((a1+3)<=b){
              System.out.print(a1);
              System.out.print(" ");
              System.out.println(a1+3);
          }
          else{
           System.out.println(gcd);   
          }
      }
      else{
          if((a1+3)<=b){
              System.out.print(a1+1);
              System.out.print(" ");
              System.out.println(a1+3);
          }
          else{
              System.out.println(gcd);
          }
      }
  }
 }
}
