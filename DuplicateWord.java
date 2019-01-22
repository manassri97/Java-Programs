import java.util.Scanner;
public class DuplicateWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b[]=a.split(" ");
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!="") 
			{
				for(int j=i+1;j<b.length;j++)
				{
					if(b[j].equals(b[i]))
						b[j]="";	
				}
			}
		}
		System.out.println("Words without duplicate :"); 
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!="")
			{
				System.out.print(b[i]+" ");
			}
		}
		sc.close();

	}

}
