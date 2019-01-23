import java.util.Scanner;
public class NonRepeating {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i=0,j=0,c=1;
		for(i=1;i<s.length()-1;i++)
		{
			if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i-1))
			{
				break;	
			}
			else
				c++;
		}
		//System.out.println(i+1);
		System.out.println(s.charAt(i));
	}

}
