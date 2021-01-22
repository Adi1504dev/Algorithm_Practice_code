package DP;

import java.util.ArrayList;

public class Counting_Longest_common_Substring {

	
	public static String commonsubstring(int[][] k,String X,int i,int j)
	{
		String ret="";
		while(k[i][j]!=0)
		{
		if(k[i][j]>k[i-1][j] &&k[i][j]>k[i][j-1] )
		{
			ret=X.charAt(i-1)+ret;
			i--;j--;
		}
		else
		{
			if(k[i-1][j]>k[i][j])
			{
				i--;
			}
			else
				j--;
		}
		}
		return ret;
	}
	
	public static int[][] common_substring(String X,String Y)
	{
		int[][] k=new int[X.length()+1][Y.length()+1];
		for(int i=0;i<=X.length();i++)
		{
			for(int j=0;j<=Y.length();j++)
			{
				if(i==0||j==0)
				k[i][j]=0;
				else
				{
					if(X.charAt(i-1)==Y.charAt(j-1))
					{
						k[i][j]=k[i-1][j-1]+1;
					}
					else
						k[i][j]=0;
				}
			}
		}
	return k;
	}
	public static void main(String []a)
{
	String X="ABABC";
	String Y="BABCA";
	int [][]k=common_substring(X,Y);
	for(int i=0;i<=X.length();i++)
	{
		for(int j=0;j<=Y.length();j++)
		{
		System.out.print(k[i][j]+"\t");
		}
		System.out.println();
		}
	int max=0;
	ArrayList<String> l=new ArrayList<String>();
	for(int i=0;i<=X.length();i++)
	{
		for(int j=0;j<=Y.length();j++)
		{
		if(max<k[i][j])
			max=k[i][j];
		}
		
	}
	System.out.println(max);
	for(int i=0;i<=X.length();i++)
	{
		for(int j=0;j<=Y.length();j++)
		{
	if(k[i][j]==max)
	{
		l.add(commonsubstring(k,X,i,j));
	}
		}
		
	}
	
	for(String t:l)
	{
		System.out.println(t);
	}
		}
}

