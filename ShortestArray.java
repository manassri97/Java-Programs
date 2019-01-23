
public class ShortestArray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},{0,2,7},{1,2,4,12},{1,2,5,6}};
		int index=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i-1].length<a[i].length)
				index=i-1;
		}
		for(int i=0;i<a[index].length;i++)
		{
			System.out.print(a[index][i]+" ");
		}
	}
}
