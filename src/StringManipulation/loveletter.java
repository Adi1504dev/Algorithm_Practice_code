package StringManipulation;

public class loveletter {
	public static int compare(String a,String b)
	{
		int count=0;
		int temp=0;
		for(int i=0;i<a.length();i++)
		{
			count=count+Math.abs((int)(a.charAt(i))-(int)(b.charAt(i)));
			
		}
		return count;
	}
	public static int op_count(String j)
	{
		int start1=0,start2=0,end1=0,end2=0;
		
		if((j.length()%2)==0)
		{
			start2=(j.length()/2);
			end1=j.length()/2;
			end2=j.length();
			
		}
		else
		{start2=(j.length()/2)+1;
		end1=(j.length()/2);
		end2=j.length();
			
		}
		return compare(j.substring(start1,end1),(new StringBuilder(j.substring(start2,end2)).reverse().toString()));
	}
public static void main(String []args)
{
	String m="";
	String []k=m.split(" ");
	int count=0;
	System.out.println(op_count("abcba"));	
	  for(int i=0;i<k.length;i++) {
		  count=count+op_count(k[i]);
	  }
	 
}
}
