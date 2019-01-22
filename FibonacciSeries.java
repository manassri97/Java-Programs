import java.util.Scanner;
public class FibonacciSeries {

	void fibo(int a)
	{
		int c=0,f=0,s=1;
		System.out.print(0+" ");
		System.out.print(1+" ");
		while(a>1)
		{
			c=s;
			s=f+s;
			f=c;
			System.out.print(s+" ");
			a--;
		}
		
	}
	
	public static void main(String[] args) {
		FibonacciSeries f=new FibonacciSeries();
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of terms");
		a=sc.nextInt();
		f.fibo(a);
		sc.close();
	}

}
