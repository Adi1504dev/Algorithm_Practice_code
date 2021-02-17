package practice;

import java.util.HashMap;

public class knapsack_Meomaization {
	private static HashMap<String , Integer> m=new HashMap<String,Integer>();
	
	private static int kmapsackMemo(int[] val,int w[],int W,int n)
	{ 
		String key=W+"|"+n;
		if(n==0||W<=0)
			return 0;
		
		if(!m.containsKey(key))
		{
			if(W<w[n-1])
				m.put(key, kmapsackMemo(val,w,W,n-1));
			else 
				m.put(key,  val[n-1]+kmapsackMemo(val,w,W-w[n-1],n-1));
				
		}
		
		return m.get(key);
		
	}
	
public static void main(String []arhgs)
{
	int val[]= {20,5,10,40,15,25};
	int w[]= {1,2,3,8,7,4};
	int W=5;
	
	System.out.println(kmapsackMemo(val,w,W,w.length));
}
}
