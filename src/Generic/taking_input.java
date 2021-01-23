package Generic;

import java.util.Scanner;

public class taking_input {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();//to complete the gap left int block
		String b=sc.nextLine();
		System.out.println(a+"\t"+b);
	}

}
