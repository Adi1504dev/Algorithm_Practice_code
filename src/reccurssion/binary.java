package reccurssion;

public class binary {

	public static String binary(int n)
	{
		if (n==0)
			return "0";
		else if(n==1)
			return "1";
		else
			return binary(n/2)+((n%2)+"");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binary(7));
	}

}
