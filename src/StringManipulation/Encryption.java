package StringManipulation;

public class Encryption {
	public static String encryption(String test)
	{
		String str=""; 
		test=test.replaceAll(" ", "");
	int length=test.length();
	int loop=(int)Math.ceil(Math.sqrt(length));
	String a[]=new String[loop];
	for(int i=0;i<loop;i++)
		a[i]="";
	for(int i=0;i<loop;i++)
		for(int j=i;j<length;j=j+loop)
			a[i]=a[i]+""+test.charAt(j);
	for(int i=0;i<loop;i++)
	{if(i==0)
		str =str+a[i];
	else
		str =str+""+a[i];
	}
	return str;
	}
		public static void main(String[] args)
		{
			String test="Have a nice day";
			
			System.out.println(encryption(test));
		}
}
 