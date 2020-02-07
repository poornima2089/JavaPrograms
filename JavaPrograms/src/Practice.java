import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		Scanner s = new Scanner(System.in);
		System.out.println("enter String:");
		String str=s.next();
		System.out.println("The length is:");
		int n=str.length();
		System.out.println(""+n);
		for(int i=n-1;i>=0;i--)
		{
	
		 rev=rev + str.charAt( i);
		}
		System.out.println("The reverse of string is:"+rev);
		if(str.equals(rev))
		{
			System.out.println("The string is PALINDROME");
		}else {
			
		
		System.out.println("The string is not PALINDROME");
	}
}
}
	
	


