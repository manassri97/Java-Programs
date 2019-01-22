import java.util.Scanner;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		boolean f;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String a=sc.next();
		sc.nextLine();
		System.out.println("enter the second string");
		String b=sc.next();
		sc.nextLine();
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
		if(a.length()==b.length())
		{
			Arrays.sort(c);
			Arrays.sort(d);
			f=Arrays.equals(c,d);
			if(f==true)
				System.out.println("Both are Anagrams");
			else
				System.out.println("Not Anagrams");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
		sc.close();
		
			

	}

}
