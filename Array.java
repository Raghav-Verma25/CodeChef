class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){ 
		    int a = sc.nextInt();
		    int b[] = { 1,2,3,4,5,6,7,8,9};
		    int c[] = new int[a];
		    int sum =0 ;
		    for(int i =0 ; i < a ; i++){
		        c[i] = b[i];
		        sum = sum + b[i];
		    }
		    if(sum % a==0){ 
		        c[0] = c[1];
		    }
		    for(int k :c){ 
		        System.out.print(k+" ");
		    }
		    System.out.println();
		    
		    t=t-1;
		}
	}
}
