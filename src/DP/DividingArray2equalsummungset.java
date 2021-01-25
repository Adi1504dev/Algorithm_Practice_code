package DP;

public class DividingArray2equalsummungset {
	public static boolean divde_array(int[] l,int sum)
	{
		if(!(sum%2==0))
			return false;
		else
		{
		boolean [][] k=new boolean[l.length+1][sum+1];
		for(int i=0;i<l.length+1;i++)
			k[i][0]=true;
		for(int j=0;j<sum+1;j++)
			k[0][j]=false;
		for(int i=0;i<l.length+1;i++)
			k[i][0]=true;
	for(int i=1;i<l.length+1;i++)
	{
		for(int j=1;j<sum+1;j++)
		{
		if(j<l[i-1])
			k[i][j]=false;
		else
			
			k[i][j]=((k[i-1][j])||k[i-1][j-(l[i-1])]);
		}
	}
	for(int i=0;i<=l.length;i++)
		{for(int j=0;j<=sum;j++)
		{
			
		System.out.print(k[i][j]+"\t");	
		}
		System.out.println();
		}

		return k[l.length][sum];
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

