package reccurssion;
import java.util.*;
public class nos_of_path_in_grid {
public static int paths(int i,int j)
{
	
	if(i==1||j==1)
	 return 1;
	
	return paths(i-1,j)+paths(i,j-1);
}
	public static void main(String p[])
	{
		int m=17;
		int n=17;
		System.out.println(paths(m,n));
	}
}
