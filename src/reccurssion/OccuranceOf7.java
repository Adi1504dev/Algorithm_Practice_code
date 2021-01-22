package reccurssion;

public class OccuranceOf7 {
	public int count7(int n) {
		  if(n==0)
			  return 0;
		  else
			  if((n%10)==7)
				  return 1+count7(n/10);
			  else
				 return 0+count7(n/10); 
	}
	public static void main(String args[])
{
	System.out.println((new OccuranceOf7()).count7(772772));
}
}
