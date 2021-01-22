package DP;

import java.util.HashMap;
import java.util.Map;

public class A2_Knapsack01_Memoization {
	private static HashMap<String, Integer> a = new HashMap<>();
public static int knapsack(int w[],int val[],int W,int n)
{
	String key=W+"|"+n;
	if(W==0||n<0)
		return 0;

	if(!a.containsKey(key))
	{
		if(W<w[n])
			a.put(key,knapsack(w,val,W,n-1));
		else
			
			a.put(key,  Math.max(knapsack(w,val,W-w[n],n-1)+val[n],knapsack(w,val,W,n-1)));
		//keep in mind to use n-1 and not val[n] as array starts from 0
		//so if you will use n then you will miss one item
		//or in base condition set n<0
	}
	return a.get(key);
}
	
	public static void main(String[] args) {
		int val[]= {20,5,10,40,15,25};
		int w[]= {1,2,3,8,7,4};
	
		int W=5;
		
		System.out.println(knapsack(w,val,W,val.length-1));
	}

}






