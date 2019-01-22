import java.util.Scanner;
public class PanagramDetector {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int j,f=0;
		char c;
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
				f=97+i;
				c=(char)f;
				System.out.print(c+" ");
			}
		}
		sc.close();
			
	}

}
