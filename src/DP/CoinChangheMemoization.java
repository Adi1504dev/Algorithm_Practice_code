package DP;

import java.util.HashMap;

public class CoinChangheMemoization {
	public static HashMap<String,Integer> lookup=new HashMap<String,Integer>();
	public static int knapsack_unbound(int W,int val[],int n)
	{
		String key=W+"|"+n;
		if(W==0)
			return 0;
		if(n<=0)
			return 10000;
		if(!lookup.containsKey(key))
		{
		if(W<val[n-1])
			lookup.put(key, knapsack_unbound(W,val,n-1));
		else
			lookup.put(key, Math.min(knapsack_unbound(W,val,n-1),1+knapsack_unbound(W-val[n-1],val,n)));
		}
		return lookup.get(key);
	}
public static void main(String []args)
{
	int val[]= {1,2,5};
	

	int W=11;
	
	System.out.println(knapsack_unbound(W,val,val.length));
}
}
