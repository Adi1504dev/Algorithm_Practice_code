package DP;
import java.util.HashMap;
public class WeigthedPath_AllDirections {
	private static HashMap<String ,Integer> m=new HashMap<String,Integer>();
	public static int max_weighted_Path(int a[][],int i,int j)
	{
		String key=i+"|"+j;
		if(i==0 && j==0) 
			return a[i][j];
			if(!m.containsKey(key))
			{
				if(i==0)
					m.put(key,max_weighted_Path(a,i,j-1)+a[i][j] );
				else if(j==0)
					m.put(key,max_weighted_Path(a,i-1,j)+a[i][j] );	
				else
					m.put(key,a[i][j]+(Math.max(max_weighted_Path(a,i-1,j-1),Math.max(max_weighted_Path(a,i,j-1),max_weighted_Path(a,i-1,j))))) ;
			}
		return m.get(key);
	}
public static void main(String []args)
{
	int a[][]=new int[2][3];
	int n = 2;
    int m = 3;
    a[0][0] = 100;
    a[0][1] = -350;
    a[0][2] = -200;
    a[1][0] = -100;
    a[1][1] = -300;
    a[1][2] = 700;
    
    System.out.println(max_weighted_Path(a,n-1,m-1));
}
}
