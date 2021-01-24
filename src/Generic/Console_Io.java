package Generic;

import java.io.Console;
public class Console_Io {
	    
	public static void main(String args[]){    
	Console c=System.console(); 
	System.out.println("Enter your name: ");    
	String n=c.readLine();    
	System.out.println("Welcome "+n);    
	System.out.println(args[0]+"\t"+args[1]);
	}  
}

