package DP;

import java.util.HashMap;

public class A3_Fabbonaci_Memoization {
	HashMap<String,Integer> m=new HashMap<String,Integer>();
	public static int fabbo(int n,HashMap<String,Integer> a)
	{
		String key=n+"";
		if(n<2)
			return 1;
		if(!a.containsKey(key))
		{
			a.put(key,fabbo(n-1,a)+fabbo(n-2,a)); 
		}
		else
			System.out.println("dada");
	return a.get(key);
		}
	public static void main(String []args)
{
		int n=3;
		HashMap<String,Integer> a=new HashMap<String,Integer>();
		a.put("0", 0);
		a.put("1", 1);
	System.out.println(fabbo(n-2,a));
}
}
