package practice;

public class Numberofpossiblepath {
	private static int  count=0;
	private static int mazepath(int n,int m)
	{
		if(m==0 && n==0)
		{
				count=count+1;
			return 1;
		}
			else
		{
			if(n==0)
				return mazepath(n,m-1) ;
			else if (m==0)
				return mazepath(n-1,m) ;
			else
				return (mazepath(n-1,m)+ (mazepath(n,m-1)));
		}
	
	}
	public static void main(String ap[])
{
		int m=2;
		int n=3;
		
		System.out.println(mazepath(m-1,n-1));
		System.out.println(count);
}
}
