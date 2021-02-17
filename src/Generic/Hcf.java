package Generic;

import java.util.Scanner;

public class Hcf {
	public static int hcf(int x,int y)
	{
		if(y==0)
			return x;
		else
			return hcf(y,x%y);
	}
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	System.out.println(hcf(m,n));
}
}
