package DP;

import java.util.HashMap;

public class RodCuttingMomoization {
	public static HashMap<String,Integer> lookup=new HashMap<String,Integer>();
	public static int knapsack_unbound(int W,int val[],int w[],int n)
	{
		String key=W+"|"+n;
		if(W==0 || n<=0)
			return 0;
		if(!lookup.containsKey(key))
		{
			if(W<w[n-1])
				lookup.put(key, knapsack_unbound(W,val,w,n-1));
			else
				lookup.put(key,Math.max(knapsack_unbound(W-w[n-1],val,w,n)+val[n-1], knapsack_unbound(W,val,w,n-1)));
		}
		return lookup.get(key);
	}
public static void main(String []args)
{
	int val[]= {1,5,8,9};
	int w[]= {1,2,3,4};

	int W=30;
	
	System.out.println(knapsack_unbound(W,val,w,val.length));
}
}

