package Generic;

public class Quadraple {
	public static int[] sort(int []a)
	{int temp=0;
	int []k=a;
	int length=a.length-1;
		for(int i=0;i<=length;i++)
		{
			for(int j=i;j<=length;j++)
			{
				if(a[i]>a[j])
				{
				temp=k[i];
				k[i]=k[j];
			k[j]=temp;
				}
			}
		}
		return k;
	}
	public static int max_quad(int ap[])
	{
		int temp =Math.max((ap[0]*ap[1]*ap[2]*ap[3]), (ap[ap.length-4]*ap[ap.length-3]*ap[ap.length-2]*ap[ap.length-1]));
		return Math.max(temp, (ap[ap.length-2]*ap[ap.length-1]*ap[0]*ap[1]));
	}
public static void main(String []a) {
	int m[]= {1, -4, 3, -6, 7, 0};
	for(int temp:sort(m))
		System.out.print(temp+"\t");
	
	System.out.println("\nMax Quad==>"+max_quad(sort(m)));
}
}
