package practice;

public class KnapsackMemoizationUnbounded {
	private static int knapsack_unbound(int W,int val[],int n)
	{
		if (W==0)
			return 0;
		else if(n<=0)
			return 10000;
		else
		{
			if(W<val[n-1])
				return knapsack_unbound(W,val,n-1);
			else
				return Math.min(knapsack_unbound(W,val,n-1),1+knapsack_unbound(W-val[n-1],val,n));
		}
	}
public static void main(String []args)
{
int val[]= {1,2,5};
	

	int W=11;
	
	System.out.println(knapsack_unbound(W,val,val.length));
}
}
