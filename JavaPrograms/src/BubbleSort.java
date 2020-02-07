import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter  array length");
		int len=s.nextInt();
		System.out.println("enter array elements:");
		int arr[]=new int[len];
	   for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("The array elements are:");
		for(int i=0;i< arr.length;i++) {
			System.out.println(""+arr[i]);
			}
		
		}


	}


