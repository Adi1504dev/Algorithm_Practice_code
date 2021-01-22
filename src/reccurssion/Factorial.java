package reccurssion;

public class Factorial {

	public static int facto(int a)
	{
		if(a<=0)
			return 1;
		else
			return a*facto(a-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(facto(-5));
	}

}