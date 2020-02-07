import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("The list elements are:");
		while(s.hasNext()) {
			String str = s.next();
			if (str.equals("done")) {
				break;
			}
			list.add(str); 
		}
		System.out.println(list);
	    Collections.sort(list);
		 System.out.println("The sorted items are: "+list);
		}

}
 