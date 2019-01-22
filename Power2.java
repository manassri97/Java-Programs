import java.util.Scanner;
public class Power2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0,c=1;
		int f=0;
		while(a>2)
		{
			if(a%2==0) {
				b=a/2;
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
			System.out.println("number is power of 2 of"+c);
		else
			System.out.println("number is not a power of 2");

	}

}
