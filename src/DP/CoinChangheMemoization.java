package DP;

import java.util.HashMap;

public class CoinChangheMemoization {
	public static HashMap<String,Integer> lookup=new HashMap<String,Integer>();
	public static int knapsack_unbound(int W,int val[],int n)
	{
		String key=W+"|"+n;
		if(W==0)
			return 0;
		if(n<0)
			return Integer.MAX_VALUE;
		if(!lookup.containsKey(key))
		{
			if(W<val[n])
				lookup.put(key, knapsack_unbound(W,val,n-1));
			else
				lookup.put(key, Math.min(knapsack_unbound(W,val,n-1), 1+knapsack_unbound(W-val[n],val,n)));
				
		}
		return lookup.get(key);
	}
public static void main(String []args)
{
	int val[]= {5,3};
	

	int W=2;
	
	System.out.println(knapsack_unbound(W,val,val.length-1));
}
}
