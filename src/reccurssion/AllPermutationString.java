package reccurssion;

public class AllPermutationString {
	public static void string_per(String out,String in)
	{if(in.length()==0)
		System.out.println(out);
	for(int i=0;i<in.length();i++)
	{
		string_per(out+in.charAt(i),in.substring(0,i)+in.substring(i+1,in.length()));
	}
	
	}
public static void main(String []args)
{
	String f="abc";
	string_per("",f);
	
}
}
 