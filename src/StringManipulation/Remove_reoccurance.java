package StringManipulation;

public class Remove_reoccurance {
	public static boolean reoccurance_count(String m)
	{
		for(int i=1;i<m.length();i++)
		{
			if(m.charAt(i)==m.charAt(i-1))
				return true;
			
		}
		return false;
	}
	public static String removal(String s)
	{
		if(s.length()<2)
			return s;
		else if(s.charAt(0)==s.charAt(1))
			return "" +removal(s.substring(2));
		else
			return s.charAt(0)+removal(s.substring(1));
	}
public static void main(String []args)
{ 
	String out="abccba";
	while(reoccurance_count(out))
	{
		out=removal(out);
	}
	System.out.println("Hello");
	System.out.println(out);
}
}
