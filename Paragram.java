import java.util.Scanner;
public class Paragram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int j,f=0;
		boolean[] b=new boolean[26];
		String a=sc.nextLine();
		for(int i=0;i<a.length();i++)
		{
			if('a'<= a.charAt(i) && a.charAt(i)<= 'z')
				j=a.charAt(i)-'a';
			else
				j=a.charAt(i)-'A';
			b[j]=true;	
		}
		for(int i=0;i<26;i++)
		{
			if(b[i]==false)
			{
				f=0;
				break;
			}
			else
				f=1;
		}
		if(f==1)
			System.out.println("It is paragram");
		else
			System.out.println("It is not paragram");
		sc.close();
			
	}

}
