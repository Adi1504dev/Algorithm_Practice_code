package DP;

public class DividingArray2equalsummungset {
	public static boolean divde_array(int[] l,int sum)
	{
		if(sum%2!=0)
			return false;
		else
		{
			boolean[][] ret=new boolean[l.length+1][sum+1];
			for(int i=0;i<=sum;i++)
				ret[0][i]=false;
			for(int i=0;i<=l.length;i++)
				ret[i][0]=true;
			for(int i=1;i<=l.length;i++)
			{
				for(int j=1;j<=sum;j++)
				{
					if(j<l[i-1])
						ret[i][j]=false;
					else
						ret[i][j]=ret[i-1][j]||ret[i-1][j-l[i-1]];
				}
			}
			for(int i=0;i<=l.length;i++)
			{
				for(int j=0;j<=sum;j++)
				{
					System.out.print(ret[i][j]+"\t");
				}
				System.out.println();
			}	
			return ret[l.length][sum];
		}
		
		}
public static void main(String args[])
{
	int[] l= {1,5,11,5};
	int sum=16;
	
		
	boolean k=divde_array(l,sum);
	

			System.out.println(k);
	
}
}

