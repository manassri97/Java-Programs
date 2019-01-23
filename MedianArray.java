import java.util.Arrays;
import java.util.Scanner;

public class MedianArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[4];
		int[] b=new int[5];
		int[] c=new int[10];
		System.out.println("enter first array");
		for(int i=0;i<4;i++)
			a[i]=sc.nextInt();
		System.out.println("enter second array");
		for(int i=0;i<5;i++)
			b[i]=sc.nextInt();
		for(int i=0;i<9;i++)
		{
			if(i<4)
				c[i]=a[i];
			else
				c[i]=b[i-4];	
		}
		Arrays.sort(c);
		for(int i=0;i<9;i++)
			System.out.print(c[i]+" ,");
		if(c.length%2!=0)
			System.out.println("median is : "+c[c.length/2]);
		else
			System.out.println("median is : "+c[c.length/2-1]);
	}

}
