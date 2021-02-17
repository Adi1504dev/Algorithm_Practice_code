import java.util.*;

public class NUM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		  char a[]=str.toCharArray();
		  String t=""; 
		  int l=a.length;
		  
		  for(int i=0;i<l;i++) 
		  {
			  if(a[i]>='0' && a[i]<='9' || a[i]==' ') 
				  t=t+a[i]; 
		  }
		  
		  t=t.replaceAll("  "," "); 
		  t.trim();
		 System.out.println(t);

		/*
		 * String str1[]=str.split(" "); for(int i=0;i<str1.length;i++) {
		 * if(str1[i].matches("[0-9]*")) { System.out.println(str1[i]); } }
		 */

	}

}
