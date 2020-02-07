import java.util.Scanner;

public class DuplicatesInArrayBrutForceMeth {
	
	

	public static void main(String[] args) {
		int  Length;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter lenght of array");
		Length=sc.nextInt();
		System.out.println("enter array elements:");
	int a[]=new int[Length];
		for (int i=0;i<a.length;i++)
		{
			 a[i]=sc.nextInt();
		}
		System.out.println("the elements are: ");
	for(int i=0;i<a.length;i++)
	{
			System.out.println(""+a[i]);
		
		}
		System.out.println("The duplicate elements of array are:");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j] && i!=j)
				{
					System.out.println(""+a[j]);
				}
			}
		}
	}
 
	}



