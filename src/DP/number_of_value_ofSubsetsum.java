package DP;

public class number_of_value_ofSubsetsum {
public static int[][] subsets(int[] l,int sum)
{
	int [][] b= new int[l.length+1][sum+1];
	for(int i=0;i<sum+1;i++)
		b[0][i]=0;
	for(int i=0;i<l.length+1;i++)
	b[i][0]=1;
	for(int i=1;i<=l.length;i++)
		{for(int j=1;j<=sum;j++)
		{
			if(j<l[i-1])
				b[i][j]=b[i-1][j];
			else
				b[i][j]=b[i-1][j]+b[i-1][j-l[i-1]];
		} 
		}
	return b;
}
	public static void main(String p[])
{
		int[] l= {1,2,1};
		int sum=3;
		int k[][]=subsets(l,sum);
		
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
