package DP;

import java.util.ArrayList;

public class A1_Fabbonaci {
public static ArrayList<Integer> Fabbonaci(int n,ArrayList<Integer> a)
{
	if (n<2)
		return a; 
	
	for(int i=2;i<n;i++)
	{
		a.add(i, (a.get(i-1)+a.get(i-2)));
	}
	return a;
}
	public static void main(String []args)
{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(0);
		a.add(1);
		ArrayList<Integer> fabbo=Fabbonaci(5,a);
	
	int i=0;
	for(Integer f:fabbo)
	{
	System.out.println(fabbo.get(i));
	i++;
	}
	}
}
