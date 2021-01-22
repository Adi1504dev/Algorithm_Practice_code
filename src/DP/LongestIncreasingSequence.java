package DP;

public class LongestIncreasingSequence {
public static int[] lis(int a[])
{
	
	int ret[]=new int[a.length];
	for(int i=0;i<a.length;i++)
		ret[i]=1;
	for(int i=1;i<a.length;i++)
	{
		for(int j=0;j<i;j++)
		{
			if ( a[i] > a[j] && ret[i] <=ret[j] ) 
				ret[i] = ret[j] + 1; 
		}
	}
	
	
	return ret;
}
	public static void main(String []args)
{
	int[] a= { 10, 22, 9, 33, 21, 50, 41, 60 };
for(int i=0;i<a.length;i++)
{
	System.out.println(lis(a)[i]);
	
}
}
}
