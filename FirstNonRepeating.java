import java.util.Scanner;
public class FirstNonRepeating {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		int j=0,i=0,k=0,c=0,index=0,x=0;
 		for(i=0;i<s1.length;i++)
		{
 			for(j=0;j<s1[i].length();j++)
 			{
 				for(k=0;k<s1[i].length();k++) 
 				{	
 					if(s1[i].charAt(j)==s1[i].charAt(k))
 					{
 						c++;
 						//System.out.println(c);
 					}
 				}
 				if(c==1)
 				{
					index=j;
					break;
 				}
 				c=0;
 				index=0;
 			}
 			System.out.print(s1[i].charAt(index)+" ");	
 			c=0;
 			index=0;
		}

	}

}
