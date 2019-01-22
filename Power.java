import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		int f=0;
		int c=1;
		while(a>5)
		{
			if(a%5==0) {
				b=a/5;
				f=1;
				c++;
			}
			else
			{
				f=0;
				break;
			}
			a=b;
		}
		if(f==1)
			System.out.println("number is power of 5 of "+c);
		else
			System.out.println("number is not a power of 5");
		

	}

}
