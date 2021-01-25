package reccurssion;
import java.util.ArrayList;
public class all_Sequence{
	private static ArrayList<String> k=new ArrayList<String>();
	public static void allSeq(String m,String l)
	{
		if(m.length()==0)
			{
			k.add(l);
			return ;
			}
		else
		{
			allSeq(m.substring(1),l+m.charAt(0));
			allSeq(m.substring(1),l);
			
		}
		}
	public static void main(String args[])
	{
		String m="abcd";
		allSeq(m,"");
		System.out.println(m.substring(1));
		System.out.println(k);
	}
}
