package DP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test{

	public static void main(String[] args)
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
		Iterator hmIterator = m.entrySet().iterator(); 
		while(hmIterator.hasNext())
		{
			Map.Entry data=(Map.Entry)hmIterator.next();
			System.out.print(data.getKey()+""+data.getValue());
			
		}
	}
}


