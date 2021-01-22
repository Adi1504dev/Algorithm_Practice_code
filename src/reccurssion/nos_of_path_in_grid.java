package reccurssion;
import java.util.*;
public class nos_of_path_in_grid {
	static HashMap<String,Integer> m=new HashMap<String,Integer>();
public static int paths(int i,int j)
{
	String key=i+"|"+j;
	if(i==1||j==1)
	 return 1;
	
	return paths(i-1,j)+paths(i,j-1);
}
	public static void main(String p[])
	{
		int m=17;
		int n=15;
		System.out.println(paths(m,n));
	}
}
