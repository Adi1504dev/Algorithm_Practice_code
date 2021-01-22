package StringManipulation;
import java.util.*;
public class CountNumberOfOccurance {
public static void main(String []args)
{
	String input="aaaabbBcddee";
	HashMap<String,Integer> m=new HashMap<String,Integer>();
	for(int i=0;i<input.length();i++)
	{
		String key=input.charAt(i)+"";
		if(m.containsKey(key))
			m.put(key, m.get(key)+1);
		else
			m.put(key, 1);
		
			
	}
Iterator it=m.entrySet().iterator();
while(it.hasNext())
{
	Map.Entry<String, Integer>  m1=(Map.Entry<String, Integer>)it.next();
	System.out.print(m1.getKey()+""+m1.getValue());
	
}
{
	
}
}
}
