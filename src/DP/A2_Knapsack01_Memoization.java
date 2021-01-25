package DP;

import java.util.HashMap;
import java.util.Map;

public class A2_Knapsack01_Memoization {
	private static HashMap<String, Integer> a = new HashMap<String,Integer>();
public static int kanpsack01(int val[],int w[],int W,int n)
{String key=W+"|"+n;
if(W==0||n<=0)
	return 0;
if(!a.containsKey(key)) 
{
if(W<w[n-1])
	a.put(key, kanpsack01(val,w,W,n-1));
else
	a.put(key, Math.max(val[n-1]+kanpsack01(val, w,W-w[n-1],n-1),kanpsack01(val, w,W,n-1)));
}
return a.get(key);
}
	
	public static void main(String[] args) {
		int val[]= {20,5,10,40,15,25};
		int w[]= {1,2,3,8,7,4};
	
		int W=5;
		System.out.println(kanpsack01(val,w,W,val.length));
		
	
	}

}






