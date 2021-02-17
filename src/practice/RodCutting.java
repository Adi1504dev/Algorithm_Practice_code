package practice;

public class RodCutting {

	public static int kanpsack01Unbound(int[] val,int w[],int sum,int n)
	{
		if(sum==0 || n<=0)
			return 0;
		else {
			if(sum<w[n-1])
				return kanpsack01Unbound(val,w,sum,n-1);
			else
				return Math.max(kanpsack01Unbound(val,w,sum,n-1),val[n-1]+kanpsack01Unbound(val,w,sum-w[n-1],n));
		}
	}
	public static void main(String []arghs)
	{
		{
			int val[]= {1,5,8,9};
			int w[]= {1,2,3,4};

			int W=30;
		System.out.println(kanpsack01Unbound(val,w,W,val.length));
	}
}
}
