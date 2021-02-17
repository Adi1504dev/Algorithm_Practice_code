package practice;

public class WaterFill {
private static int maxleft(int a[],int i)
{
	int max=a[0];
	for(int j=0;j<i;j++)
	{
		if(a[j]>max)
			max=a[j];
	}
	return max;
}

private static int maxright(int a[],int i)
{
	int max=a[a.length-1];
	for(int j=i;j<a.length;j++)
	{
		if(a[j]>max)
			max=a[j];
	}
	return max;
}

public static void main(String p[])
{
	//int a[]= {3,0,0,2,0,4};
	int a[]= {6,9,9};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		int temp=Math.min(maxleft(a,i-1), maxright(a,i+1))-a[i];
		if(temp>0)
			sum=sum+temp;
	}
	System.out.println(sum);
}
}
