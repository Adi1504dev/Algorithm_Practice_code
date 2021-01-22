package reccurssion;

public class Countx {
	public int countX(String str) {
		  if(str.length()==0)
			  return 0;
		  else
		  {
			  if(str.charAt(0)=='x')
				  return 1+countX(str.substring(1,str.length()));
			  else
				  return 0+countX(str.substring(1,str.length()));
		  }
	}

public static void main(String []args)
{
System.out.println((new Countx()).countX("xxDDsfssxX"));	
}
}
