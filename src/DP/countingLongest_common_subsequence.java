package DP;

import java.util.ArrayList;

public class countingLongest_common_subsequence {
	
public static String commonsequence(int [][]k,String X,String Y,int i,int j)
{
	String ret="";
	while(k[i][j]!=0)
	{
		if(k[i][j]>k[i-1][j]&&k[i][j]>k[i][j-1])
		{
			ret=X.charAt(i-1)+ret;
			i=i-1;
			j=j-1;
		}
		else
		{
			if(k[i-1][j]>k[j-1][i])
			{
				i--;
				
			}
			else
			{
				j--;
			}
		}
	}
return ret;
}

public static int[][] count_sequence_length(String x,String y)
{
	int [][] k=new int [x.length()+1][y.length()+1];
	
	
	
	for (int i=0;i<=x.length();i++)
	{
		for (int j=0;j<=y.length();j++)
		{
			if(i==0||j==0)
				k[i][j]=0;
			else if(x.charAt(i-1)==y.charAt(j-1))
				k[i][j]=1+k[i-1][j-1];
			
			
			else
				k[i][j]=Math.max(k[i-1][j],k[i][j-1]);
		}
	}
	
	
return k;
}
public static void main(String args[])
{
	String X= "ABAB";
	String Y="BABA";
	int max=0;
	int row=0,col=0;
	int k[][]=count_sequence_length(X,Y);
	
	for(int i=0;i<=X.length();i++)
	{
		for(int j=0;j<=Y.length();j++)
		{
			System.out.print(k[i][j]+"\t");
			if(k[i][j]>=max)
			{
				max=k[i][j];
				row=i;
				col=j;
			}
			}
		System.out.println();
		}
	System.out.println("Max Length->"+max+"\trow=>"+row+", col=>"+col);
	
	ArrayList<String> m=new ArrayList<String>();
	for(int i=0;i<=X.length();i++)
	{
		for(int j=0;j<=Y.length();j++)
		{
			if(k[i][j]==1)
			{
				m.add(commonsequence(k,X,Y,i,j));
			}
		}
	}
	for(String t:m)
		System.out.println(t);
	
		}
}




