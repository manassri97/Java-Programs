import java.util.Scanner;
public class Numerology {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5,8,3,5,1,1,2,3,4,5,7,8,1,2,3,4,6,6,6,5,1,7};
		String s=sc.nextLine();
		int sum=0,index=0,x=0;
		for(int i=0;i<s.length();i++)
		{
			if(65 <=s.charAt(i) && s.charAt(i)<= 91)
			{
			index=s.charAt(i)-'A';
			sum+=a[index];
			if(sum>9)
			{
				x=sum%10;
				sum=sum/10+x;
			}
			}
			//System.out.println(sum);
		}
		
		System.out.println(sum);
		

	}

}
