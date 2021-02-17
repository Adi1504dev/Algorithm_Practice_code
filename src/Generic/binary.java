package Generic;
import java.util.Scanner;
public class binary {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		String out="";
		
		for(int i=k;i>0;i=i/2)
		{
		out=(i%2)+out;
		}
		System.out.println(out);
	}

}
