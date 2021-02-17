package StringManipulation;

import java.util.Scanner;

public class GoodNumber {
	public static boolean testing(String k,int l)
	{
		String temp=k.substring(0,l);
		k=k.substring(temp.length());
		while(!k.equals(""))
		{	temp=1+Integer.parseInt(temp)+"";
		if(!k.startsWith(temp))
			return false;
		k=k.substring(temp.length());
		}
		return true;
	}
	public static boolean goodnumber(String t)
	{
		for(int i=1;i<(t.length()/2)+1;i++)
		{
			if(testing(t,i))
				return true;
		}
		return false;
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		sc.nextLine();
		String l[]=new String[m];
		for(int i=0;i<m;i++)
		{
			l[i]=sc.nextLine();
		}

		for(String temp:l)
		{
			System.out.println(goodnumber(temp)?"Yes":"No");
		}	
	}

}
