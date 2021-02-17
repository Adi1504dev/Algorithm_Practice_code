package StringManipulation;

import java.util.Arrays;



public class StringFunctions {
public static void main(String []a)
{
	String m="Hell rwe  2 o 99";
	int g=549859;
	System.out.println(new StringBuilder(m).reverse().toString());
	String f=g+"";
	System.out.println(m.replaceAll("el", "f"));//takes string input
	System.out.println(m.replace('e','g'));//take character input
	System.out.println(m.replaceAll("\\s", ""));
	String j[]=m.split("\\s");
	for(String u:j)
		System.out.println(u);
if("Aman".contains("Ama")) {
	System.out.println("no");
}

if("Aman".equalsIgnoreCase("aman"))
{
	System.out.println("hi");
}
if("Aman".compareToIgnoreCase("aman")==0)
{
	System.out.println("byw");
}
System.out.println("abc".compareTo("def"));
System.out.println((char)67);

String k[]=m.split(" ");
for(String t:k)
	System.out.print(t+"\t");
System.out.println();
Arrays.sort(k);
for(String t:k)
	System.out.print(t+"\t");
System.out.println();
for(String t:k)
{
	if(t.matches("[0-9]*"))
		System.out.println(t);
}

}

}
