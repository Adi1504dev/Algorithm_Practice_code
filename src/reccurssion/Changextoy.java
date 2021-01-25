package reccurssion;

public class Changextoy {

	public  String changeXY(String str )
	{
		if(str.length()==0)
			return "";
		else
		{
			if(str.charAt(0)=='x')
				return "y"+changeXY(str.substring(1,str.length()));
			else
				return str.charAt(0)+changeXY(str.substring(1,str.length()));
		}
	}
	
	public static void main(String args[])
	{ 
		String a="xhixhix";
		System.out.println((new Changextoy()).changeXY(a));
				
	}
}
