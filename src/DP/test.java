package DP;

import java.util.*;
public class test{

	public static void main(String[] args)
	{
		 int c=0;                            //  variable of final array
		 char k[]=new char[50];
		 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();                     //Enter num of strings u want to concatenate
		sc.nextLine();//yaha ek change hai(Change 1)
		String s[]=new String[n];            
		
		
		for(int i=0;i<s.length;i++)//yaha ek change hai(Change 2)
			{
			s[i]=sc.nextLine();//Enter value of n string
			}
       
          
      
       for(int p=0;p<s.length;p++)
       {
    	   String s1=s[p];
       for(int i=0;i<s1.length();i++)
       {  
    	   k[c]=s1.charAt(i);
    	   c++;
    	  
       }
      
       }
       
       
       
       int t=0;
        k[c]='0';
        while(k[t]!='0')
        {
        	System.out.print(k[t]);
        	t++;
        }
        
	}

}
