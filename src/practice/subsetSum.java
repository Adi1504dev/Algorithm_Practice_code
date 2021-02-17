package practice;

import java.util.HashMap;

public class subsetSum {
	public static int count=0;
	public static HashMap<String,Integer> m=new HashMap<String,Integer>();
	private static int kanpsack01(int []k,int sum,int n)
	{
		String key=sum+"|"+n;
		if(sum==0)
		{
			count=count+1;
			
			return 0;
			
		}
		else if(n<=0)
			return 10000;
		else
		{
			if(sum<k[n-1])
				m.put (key,kanpsack01(k,sum,n-1));
			else
				m.put (key,kanpsack01(k,sum,n-1)+(kanpsack01(k,sum-k[n-1],n-1)));
		}
		return m.get(key);
	}
public static void main(String []args)
{
	int[] l={2,3,2,1,1};
	int sum=6;
	int k= kanpsack01(l,sum,l.length);
	System.out.println(count);
}
}
