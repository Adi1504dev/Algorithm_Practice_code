package reccurssion;

public class SumOfDigit {
	public int sumDigits(int n) {
	if (n==0)

		return 0;

	else 
	{
		return (n%10)+sumDigits(n/10);
	}
	}

	
	public static void main(String []args)
{
	System.out.println((new SumOfDigit()).sumDigits(124));
}
}
