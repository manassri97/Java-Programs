import java.util.Scanner;
public class StringWeight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int i=0,j=0,sum=0;
		for(i=0;i<a.length();i++)
		{
			if('a'<= a.charAt(i) && a.charAt(i)<= 'z')
				j=a.charAt(i)-'a'+1;
			else
				j=a.charAt(i)-'A'+1;
			sum+=j;
		}
		System.out.println("weight is : "+sum);
		sc.close();
	}

}
