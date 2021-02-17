package DP;

public class CoinChangeTabular {
	
	public static int[][] kanpsack_unbound(int W,int[] val)
	{
		int [][] ret=new int[val.length+1][W+1];
		for(int i=0;i<=W;i++)
			ret[0][i]=10000;
		for(int i=0;i<=val.length;i++)
			ret[i][0]=0;
		for(int i=1;i<=val.length;i++)
		{
			for(int j=1;j<=W;j++)
			{
				
				if(j<val[i-1])
					ret[i][j]=ret[i-1][j];
				else
					ret[i][j]=Math.min(ret[i-1][j],1+ret[i][j-val[i-1]]);
					
			}
		}
		return ret;
	}
	
	
public static void main (String p[]) 
{
	int val[]= {1,2,5};

	int W=11;
	
	for(int i=0;i<=val.length;i++)
	{
		for(int j=0;j<=W;j++)
		{
			
			System.out.print(kanpsack_unbound(W,val)[i][j]+"\t");
		}
	System.out.println();

	}
}
}
