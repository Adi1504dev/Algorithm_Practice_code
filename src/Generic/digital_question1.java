package Generic;

public class digital_question1 {
	public static void main(String []agrs)
	{
		int[] m= {3,5,1,2,3,9,3,4,5,90};
		int fi=0;
		for(int i=0;i<m.length;i++)
		{
			int j=i;
			int fi1=m[i];
			int fi2=m[i];
			while(j+1<(m.length) && m[j]<m[j+1])
			{
				fi1=m[j+1];
				j++;
			}
			int res=fi1-fi2;
			if(fi<res)
				fi=res;
		}
		System.out.println(fi);
	}

}
