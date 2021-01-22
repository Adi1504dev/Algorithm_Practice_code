package reccurssion;

import java.util.Arrays;

public class Fabbonaci {
	public static int[] Fabbo(int m ,int a[])
	{
		if(m<2)
			return a;
		else
		{
			int temp1,temp2;
			if(a[m-1]!=-1)
			{
			
				temp1=a[m-1];
				
			}	
				else
				 temp1=Fabbo(m-1,a)[m-1];
			
			if(a[m-2]!=-1)
			{
		//System.out.print("Optimized1");
				temp2=a[m-2];
			
			}
			else
				temp2=Fabbo(m-1,a)[m-2];
			
			a[m]=temp1+temp2;
			return a;
		}
		
		

	}
public static void main(String []args) {
	int a[]=new int[100];
	Arrays.fill(a,-1);
	a[0]=0;
	a[1]=1;
	a=Fabbo(15,a);
	for(int a1:a)
	{
		if(a1==-1)
			break;
		System.out.println(a1);
	}

}
}
