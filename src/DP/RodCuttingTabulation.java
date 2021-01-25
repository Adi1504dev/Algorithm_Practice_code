package DP;

public class RodCuttingTabulation {
public static int [][] kapsack_unound(int W,int w[],int val[])
{
	int [][] ret=new int[val.length+1][W+1];
	for(int i=0;i<=val.length;i++)
	{
		for(int j=0;j<=W;j++) 
		{
			if(i==0||j==0)
				ret[i][j]=0;
			else if(j<w[i-1])
				ret[i][j]=ret[i-1][j];
			else
				ret[i][j]=Math.max(ret[i-1][j],val[i-1]+ ret[i][j-w[i-1]]);
					
		}
	}
	return ret;
}
	public static void main(String arhgs[])
{
		int val[]= {1,5,8,9};
		int w[]= {1,2,3,4};

		int W=4;
		for(int i=0;i<val.length;i++)
		{
			for(int j=0;j<=W;j++)
			{
				
				System.out.print(kapsack_unound(W,w,val)[i][j]+"\t");
			}
		System.out.println();

		}
		}
}
