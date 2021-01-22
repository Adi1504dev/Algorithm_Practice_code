
package DP;

import java.util.ArrayList;

public class Shortest_common_supersequence {
	
	
public static int[][] count_sequence_length(String X,String Y)
{
	int [][] lookup=new int [X.length()+1][Y.length()+1];
	
	
	   for (int i = 0; i <= X.length(); i++)
	    {
	        for (int j = 0; j <= Y.length(); j++)
	        {
	            if(j==0)
	            	lookup[i][j]=i;
	            else if(i==0)
	            	lookup[i][j]=j;
	        	// if current character of X and Y matches
	            else if (X.charAt(i-1) == Y.charAt(j-1))
	                lookup[i][j] = lookup[i - 1][j - 1] + 1;
	 
	            // else if current character of X and Y don't match
	            else
	                lookup[i][j] = Math.min(lookup[i - 1][j] + 1,
	                                lookup[i][j - 1] + 1);
	        }
	    }
	
	
return lookup;
}
public static void main(String args[])
{
	String X= "ABCBDAB";
	String Y="BDCABA";
	int max=0;
	int row=0,col=0;
	int k[][]=count_sequence_length(X,Y);
	
	for(int i=0;i<=X.length();i++)
	{
		for(int j=0;j<=Y.length();j++)
		{
			System.out.print(k[i][j]+"\t");
			if(k[i][j]>=max)
			{
				max=k[i][j];
				row=i;
				col=j;
			}
			}
		System.out.println();
		}
	System.out.println("Max Length->"+max+"\trow=>"+row+", col=>"+col);
	ArrayList<String> m=new ArrayList<String>();

}
}
