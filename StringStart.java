import java.util.Scanner;
public class StringStart {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c;
		String a=sc.nextLine();
		String b[]=a.split(" ");
		for(int i=0;i<b.length;i++)
		{
			c=b[i];
			if(c.charAt(0)=='s')
				System.out.print(b[i]+" ");
		}
		
		sc.close();
	}

}