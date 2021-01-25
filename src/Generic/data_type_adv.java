package Generic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class data_type_adv{
public static void main(String []args)
{
	ArrayList<Integer> m=new ArrayList<Integer>();
	m.add(5);
	m.add(6);
	m.add(7);
	m.add(8);
	m.add(9); 
	/*
	 * for(Integer i:m) { System.out.println(i); }
	 */
	
	/*
	 * int[] a= {1,2,3,4,5,6}; System.out.println(a.length); String h="dads";
	 * System.out.println(h.length()); for(int i=0;i<m.size();i++) {
	 * System.out.println(m.get(i)); }
	 */
	
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("1", 10);
	hm.put("2", 11);
	hm.put("3", 12);
	hm.put("4", 13);
	hm.put("5", 14);
	hm.put("6", 15);
	hm.put("6",90);
	
	Iterator it=hm.entrySet().iterator();
	while(it.hasNext())
	{
		Map.Entry<String, Integer> temp=(Map.Entry<String, Integer>)it.next();
		//System.out.println("Key ==>" +temp.getKey()+"\tValue==>"+temp.getValue());
		
		
		if(temp.getKey().equals("4"))
		{
			hm.put(temp.getKey(), 90);
		}
		System.out.println("Key ==>" +temp.getKey()+"\tValue==>"+temp.getValue());
	}
}
}

 
