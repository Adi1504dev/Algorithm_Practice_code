package StringManipulation;

import java.util.HashMap;

public class frequecyOfCharacter {

public static void main(String []args)
{
	HashMap<String,Integer> m=new HashMap<String,Integer>();
	
	String j="java";
	
	for(int i=0;i<j.length();i++)
	{
		String key=j.charAt(i)+"";
		if(m.containsKey(key))
			m.put(key, m.get(key)+1);
		else
			m.put(key, 1);
		
	}
System.out.println(m.get("a"));
}
}

