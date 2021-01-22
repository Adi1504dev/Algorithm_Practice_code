package reccurssion;

import java.util.Arrays;

public class Fabbonaci_non_optimized {
	public static int[] Fabbo(int m ,int a[])
	{
		if(m<2)
			return a;
		else
		{
			
			
			a[m]=Fabbo(m-1,a)[m-1]+Fabbo(m-1,a)[m-2];
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