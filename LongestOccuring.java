import java.util.Scanner;
public class LongestOccuring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int i=0,j=0,f=1,count=0,co=0;
		while(f!=0)
		{
			for(int c=0;c<a.length();c++)
			{
				for(int d=c;d<a.length();d++)
				{
					if(a.charAt(c)==a.charAt(d))
						count++;
					else
						break;
				}
				if(count>co) {
					co=count;
					i=c;
				}
				count=0;
			}
			f=0;
		}
		System.out.println("longest sequence is "+co+" at index "+i);

	}

}
