package practice;

public class WeightedInAlldirection {
private static int weightedMaze(int n,int m, int [][]a)
{
	if(m==0 && n==0)
		return a[n][m];
	else
	{
		if(n==0)
			return weightedMaze(n,m-1,a) +a[n][m];
		else if (m==0)
			return weightedMaze(n-1,m,a) +a[n][m];
		else
			return Math.max(weightedMaze(n-1,m,a), Math.max(weightedMaze(n,m-1,a), weightedMaze(n-1,m-1,a)))+a[n][m];
	}
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
    System.out.println(weightedMaze(n-1,m-1,a)); 
}
}
