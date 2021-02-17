package StringManipulation;

public class FrequenyCounter {
public static void main(String []args)
{
	String k="jaba*&&##$$bAAvvBBaa";
	int []m=new int[300];
	for(int i=0;i<m.length;i++)
		m[i]=0;
	for(int i=0;i<k.length();i++)
{
	m[(int)k.charAt(i)]=m[(int)k.charAt(i)]+1;
}
	
	for(int i=0;i<m.length;i++)
	{
		if(m[i]>1)
		System.out.println((char)(i)+"-->"+m[i]);
	}
}
}



