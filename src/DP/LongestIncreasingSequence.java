package DP;

import java.util.ArrayList;

public class LongestIncreasingSequence {
public static int[] lis(int a[])
{
	
	int []ret=new int[a.length];
	for(int i=0;i<a.length;i++)
		ret[i]=1;
	for(int i=1;i<a.length;i++)
	{
		for(int j=0;j<i;j++)
		{
			if(a[i]>a[j] && ret[i]<=ret[j])
				ret[i]=1+ret[j];
		}
	}
	return ret;
}

	public static void main(String []args)
{
	int[] a= { 5,8,7,1,9 };
int max=0;	
int index=0;
for(int i=0;i<a.length;i++)
{
	System.out.println(lis(a)[i]);
	if(lis(a)[i]>=max)
		{max=lis(a)[i];
		index=i;
		}
		
		
}

ArrayList<String> l1=new ArrayList<String>();
ArrayList<String> l2=new ArrayList<String>();
int i=0;
while(max!=0)
{
	if(i==0) {
		
	l1.add((a)[index]+"");
	i++;
	max--;
	index--;
	}
	else
	{
		for(int t=index;t>=0;t--)
		{
			if(lis(a)[t]==max)
			{
				for(String temp:l1)
				{
				l2.add(a[t]+temp);
				}
			}
		}
	l1=l2;
	l2=new ArrayList<String>();
	max--;
	}
	
	
	
	for(String temp:l1)
		System.out.println(temp);
	
	
}
}
}
