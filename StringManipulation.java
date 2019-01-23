import java.util.Scanner;
public class StringManipulation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int i=0,j=0,f=1,count=0,co=0,c=0,d=0;
		while(f!=0)
		{
			for(c=0;c<a.length();c++)
			{
				for(d=c;d<a.length();d++)
				{
					if(a.charAt(c)==a.charAt(d))
						count++;
					else
						break;
					
				}
				System.out.print(a.charAt(c)+" = "+count+", ");
				count=0;
				c=d-1;
			}
			f=0;
		}
	}	
}
