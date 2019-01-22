import java.util.Scanner;
public class Power10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0,c=1;
		int f=0;
		while(a>10)
		{
			if(a%10==0) {
				b=a/10;
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
			System.out.println("number is power of 10 of"+c);
		else
			System.out.println("number is not a power of 10");


	}

}
