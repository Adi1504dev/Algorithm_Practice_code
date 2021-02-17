package Generic;

import java.util.Scanner;

public class hcfClass {

	public static boolean factor(int a[],int k)
	{
		boolean ret=((a[0]%k)==0);
		for(int i=1;i<a.length;i++)
		{
			ret=ret && ((a[i]%k)==0);
		}
		return ret;
	}

	public static int[] divide(int a[],int k)
	{

		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]/k;
		}
		return a;
	}
	public static int maxValue(int a[]) {
		int max=1;
		for(int temp:a)
			max=Math.max(max, temp);
		return max;
	}

	public static void main(String []arhgs)
	{

		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int[] m=new int[count];
		for(int i=0;i<count;i++)
			m[i]=sc.nextInt();
		int hcf=1;
		for(int i=2;i<=((maxValue(m)/2)+1);i++)
		{
			while(factor(m,i))
			{
				hcf=hcf*i;
				m=divide(m,i);
			}			
		}
		System.out.println(hcf);
	}
}
