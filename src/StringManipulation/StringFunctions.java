package StringManipulation;

public class StringFunctions {
public static void main(String []a)
{
	String m="Hell rwe o";
	int g=549859;
	System.out.println(new StringBuilder(m).reverse().toString());
	String f=g+"";
	System.out.println(m.replaceAll("el", "f"));//takes string input
	System.out.println(m.replace('e','g'));//take character input
	System.out.println(m.replaceAll("\\s", ""));
	String j[]=m.split("\\s");
	for(String u:j)
		System.out.println(u);
if("Aman".contains("ma")) {
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

System.out.println((char)67);
}

}
