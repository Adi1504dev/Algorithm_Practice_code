package reccurssion;

public class ChangePI {
	public String changePi(String str) {
		  if(str.length()==0)
			  return "";
		  else
		  {
			  if(str.charAt(0)=='p' && str.charAt(1)=='i')
				  return "3.14"+changePi(str.substring(2,str.length()));
			  else
				  return str.charAt(0)+(str.substring(1,str.length()));
				  
			  
		  }
	}

	public static void main(String args[])
	{
		System.out.println((new ChangePI()).changePi("xpix"));
	}
}
