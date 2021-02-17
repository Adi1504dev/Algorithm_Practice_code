package reccurssion;
import java.util.ArrayList;
public class all_Sequence{
	private static ArrayList<String> k=new ArrayList<String>();
	public static void allSeq(String in,String out)
	{
		if(in.length()==0)
			{k.add(out);
			return;
			}
		else
		{
			allSeq(in.substring(1),out+in.charAt(0));
			allSeq(in.substring(1),out);
		}
		
	}
		
	public static void main(String args[])
	{
		String m="abc";
		allSeq(m,"");

		System.out.println(k);
	}
}
