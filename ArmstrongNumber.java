import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt();
		int c=0,sum=0,d=0;
		int a=0,b=0,x=0;
		for(int i=1;i<=100;i++)
		{
			a=i;
			b=i;
			x=i;
		while(a!=0)
		{
			a=a/10;
			c++;
		}
		
		while(b!=0)
		{
			d=b%10;
			sum+=(int)Math.pow(d,c);
			b=b/10;
		}
		c=0;
		if(x==sum)
			System.out.println(sum);
		sum=0;
		}
	}

}
