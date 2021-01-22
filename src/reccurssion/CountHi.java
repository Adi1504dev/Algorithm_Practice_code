package reccurssion;

public class CountHi {
	public int countHi(String str) {
		  if(str.length()<=0)
			  return 0;
		  else
		  {
			  if(str.charAt(0)=='h' && str.charAt(1)=='i' )
				  return 1+countHi(str.substring(2,str.length()));
			  else
				  return 0+countHi(str.substring(1,str.length()));
		  }
	}

public static void main(String []args)
{
System.out.println((new CountHi()).countHi("xhixhix"));	
}
}