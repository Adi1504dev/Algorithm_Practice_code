package DP;

import java.util.HashMap;

public class numberofpossiblepathongridmemoaization {
	private static HashMap<String,Integer> m=new HashMap<String,Integer>();
	public static int paths(int i,int j)
	{
		String key=i+"|"+j;
		if(i==1||j==1)
		 return 1;
		if(!m.containsKey(key))
		{
		m.put(key,paths(i-1,j)+paths(i,j-1));	
		}
		else
		{
			System.out.println("hello");
		}
		return m.get(key);
	}
		public static void main(String p[])
		{
			int m=30;
			int n=250;
			System.out.println(paths(m,n));
		}
	}

