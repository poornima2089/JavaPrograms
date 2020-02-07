import java.util.Scanner;

public class Fact_highestAmong3_Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1;
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter number");
	     n=sc.nextInt();
	     System.out.println("the factorial of" +n+ "is:"); 
	     for(int i=1;i<=n;i++) {
	    	 fact=fact*i;
	    	 }
	     System.out.println(""+fact);
	     
		
		int a,b,c;
		 System.out.println("enter a:"); 
		  a=sc.nextInt();
		
		 System.out.println("enter b:"); 
		  b=sc.nextInt();

	     System.out.println("enter c:"); 
			c=sc.nextInt();
			if(a>b && a>c ) {
				System.out.println("a:"+a+ "is 1st highest number");
			}else if (b>c && b>a) {
				System.out.println("b:"+b+"is 1st highest");
		} else if(c>a && c>b) {
			System.out.println("c"+c+"is 1st highest");
		}
		
			int x,y;
			System.out.println("enter x:");
			x=sc.nextInt();
			System.out.println("enter y:");
			y=sc.nextInt();
			System.out.println("The value of x is:"+x+"The value of y is:"+y);
			x=x+y;
			y=x-y;
			x=x-y;
			System.out.println("The values of X & Y after swaping are: X is :"+x+"y is :"+y);
			
			
	}
		
		

	}


