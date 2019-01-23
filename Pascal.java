import java.util.Scanner;
public class Pascal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x co-ordinate");
		int a=sc.nextInt();
		System.out.println("enter y co-ordinate");
		int b=sc.nextInt();
		int i=0,j=0,n=4,number=1,result=0;
		for(i=0;i<n;i++)
		{
			number=1;
			for(j=0;j<=i;j++)
			{
				System.out.print(number+" ");
				if(i==a-1 && j==b-1)
					result=number;
				number=number*(i-j)/(j+1);
				
			}
			System.out.println();
			
		}
		System.out.println("answer is : "+result);
		

	}

}
