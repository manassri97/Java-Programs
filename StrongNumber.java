import java.util.Scanner;
public class StrongNumber {

	int fact(int a)
	{
		int s=1;
		for(int i=a;i>0;i--)
		{
			s*=i;
		}
		return s;
	}
	public static void main(String[] args) {
		StrongNumber sn=new StrongNumber();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int x=a;
		int b=0,sum=0,r=0;
		while(a!=0)
		{
			b=a%10;
			a=a/10;
			r=sn.fact(b);
			sum+=r;
		}
		if(x==sum)
			System.out.println("A Strong Number");
		else
			System.out.println("Not a Strong Number");
		sc.close();
	}

}
