 
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class StringAnagram {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("ente r str1:");
    String str1=s.next();
    System.out.println("enter str2:");
    String str2=s.next();
     char arr1[]=str1.toCharArray();
     char arr2[]=str2.toCharArray();
     Arrays.sort(arr1);
     Arrays.sort(arr2);
     String sortedarr1=new String(arr1);
     String sortedarr2=new String(arr2);
    if(sortedarr1.equals(sortedarr2)) 
    {
    	System.out.println("The strings are Anagram");
    }else {
    	System.out.println("The strings are not Anagram");
    }
    
    }
}
