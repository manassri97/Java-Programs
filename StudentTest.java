import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=1,sum=0;
		double avg=0,max=0;
		String[][] s=new String[4][2];
		for(int i=0;i<s.length;i++)
		{
			
				System.out.println("enter "+(i+1)+" name");
				s[i][0]=sc.nextLine();
				System.out.println("enter "+(i+1)+" marks");
				s[i][1]=sc.nextLine();
			
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i][0]!="")
				sum=Integer.parseInt(s[i][1]);
			for(int j=i+1;j<s.length;j++) 
			{
				
				if(s[i][0].equalsIgnoreCase(s[j][0]))
				{
					sum+=Integer.parseInt(s[j][1]);
					c++;
					s[j][0]="";
					s[j][1]="";
				}	
			}		
			if(c==1)
				avg=(double)sum/c;
			else
				avg=(double)sum/(c);
			if(max<avg)
				max=avg;
			sum=0;
			c=1;
		}
		System.out.println("maximun average is : "+Math.floor(max));
	}
}
