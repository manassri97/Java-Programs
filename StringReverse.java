import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] s1=s.toCharArray();
		char[] s2=new char[s.length()];
		int i=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ') {
				s2[i]+=' ';
			}
			else
				s2[i]+=s1[s.length()-1-i];
			
		}
		for(i=0;i<s2.length;i++)
		{
			System.out.print(s2[i]);
		}
		

	}

}
