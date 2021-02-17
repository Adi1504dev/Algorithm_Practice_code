package practice;

public class LongestSequence {
	private static int [][] CommonSubsequence(String x,String y)
	{
		int[][] ret=new int[x.length()+1][y.length()+1];
	for(int i=0;i<=x.length();i++)
	{
		for(int j=0;j<=y.length();j++)
		{
			if(i==0||j==0)
				ret[i][j]=0;
			else if(x.charAt(i-1)==x.charAt(j-1) && i!=j)
				ret[i][j]=ret[i-1][j-1]+1;
			else
				ret[i][j]=Math.max(ret[i-1][j],ret[i][j-1]);
			
		}
	}
	return ret;
		
	}
public static void main(String []args)
{
	//String X= "shinchan";
	//String Y="noharaa";
	String X= "ATACTCGGA";
	String Y="ATACTCGGA";
	
	for(int i=0;i<=X.length();i++)
	{
		for(int j=0;j<=Y.length();j++)
		{
			System.out.print(CommonSubsequence(X,Y)[i][j]+"\t");
		}
		System.out.println();
}
}
}