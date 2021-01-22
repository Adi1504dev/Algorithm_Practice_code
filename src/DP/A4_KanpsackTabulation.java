package DP;

public class A4_KanpsackTabulation {
	
	 static int knapSack(int W, int wt[],  
             int val[], int n) 
{ 
int i, w; 
int K[][] = new int[n + 1][W + 1]; 

// Build table K[][] in bottom up manner 
for (i = 0; i <= n; i++)  
{ 
 for (w = 0; w <= W; w++)  
 {
	 
	 if(i==0||w==0)
		 K[i][w]=0;
	 else if(w>wt[i-1])
		 K[i][w]=Math.max(K[i-1][w],val[i-1]+ K[i-1][w-wt[i-1]]);
	 else
		 K[i][w]=K[i-1][w];
	 
 }
 
} 

return K[n][W]; 
} 

public static void main(String []args)
{
		int val[]= {20,5,10,40,15,25};
		int w[]= {1,2,3,8,7,4};
	int W=10;
		
		
		System.out.println(knapSack(W,w,val,val.length));
}
}
