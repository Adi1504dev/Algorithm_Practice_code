package reccurssion;

public class BlocksinTriangle {
	public int triangle(int rows) {
		   
		if(rows==0)
			  return 0;
		 
		  else
		  {
			  return rows+triangle(rows - 1);
		  }
	}
	
	public static void main(String args[])
	{
		System.out.println(new BlocksinTriangle().triangle(2));
	}
}
 