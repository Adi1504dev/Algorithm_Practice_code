package DP;

public class A4_KanpsackTabulation {
	
public static int[][] knapSack(int W,int w[],int val[])
{
	int[][] ret=new int[val.length+1][W+1];
	for(int i=0;i<=val.length;i++)
	{
		for(int j=0;j<=W;j++)
		{
			if(j==0||i<=0) 
				ret[i][j]=0;
			else if(w[i-1]>j)
				ret[i][j]=ret[i-1][j];
			else 
				ret[i][j]=Math.max(ret[i-1][j],val[i-1]+ ret[i-1][j-w[i-1]]);
		}
	}
			return ret;
}

public static void main(String []args)
{
	int val[]= {20,5,10,40,15,25};
	int w[]= {1,2,3,8,7,4};

	int W=5;
		
		
		System.out.println(knapSack(W,w,val));
		
		for(int i=0;i<=val.length;i++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.print(knapSack(W,w,val)[i][j]+"\t");
			}
			
			System.out.println();
		}
		
}
}
