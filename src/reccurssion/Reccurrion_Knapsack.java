package reccurssion;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Reccurrion_Knapsack {
	
	public static int knapsack(int[] w, int[] val,int W,int n)
	{
		if(n<0||W==0)
			return 0;

		else if(W<w[n])
			return knapsack(w,val,W,n-1);
		
		else
			
			return Math.max(knapsack(w,val,W,n-1),val[n]+knapsack(w,val,W-w[n],n-1));
		
		
	}
public static void main(String args[])
{
	int val[]= {20,5,10,40,15,25};
	int w[]= {1,2,3,8,7,4};
	int W=10;
	System.out.println(knapsack(w,val,W,val.length-1));
}
}
