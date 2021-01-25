package DP;

public class SubsetSumproblem {
	public static boolean[][] subset_sum(int[] l ,int sum)
	{
		boolean[][] k=new boolean[l.length+1][sum+1];
	
	for(int i=0;i<=sum;i++)
		k[0][i]=false;
	for(int i=0;i<=l.length;i++)
		k[i][0]=true; 
	for(int i=1;i<=l.length;i++)
	{
		for(int j=1;j<=sum;j++)
		{
			if(j<l[i-1])
				k[i][j]=false;
			else
				k[i][j]=k[i-1][j]||k[i-1][j-l[i-1]];
		}
	}
	return k;
	}
public static void main(String args[])
{
	int[] l= {2,2,3};
	int sum=5;
	boolean k[][]=subset_sum(l,sum);
	
	for(int i=0;i<=l.length;i++)
	{
		for(int j=0;j<=sum;j++)
		{
			System.out.print(k[i][j] +"\t");
		}
		System.out.println();
	}
	
}
}
