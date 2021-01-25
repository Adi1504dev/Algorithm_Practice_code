package reccurssion;

public class BunnyEars {

	public int bunnyEars2(int bunnies) {
		if(bunnies==0)
			return 0;
		
		else
		{
			
			if((bunnies%2)==0)
			{
				return bunnyEars2(bunnies-1)+3;
			}
			else
				return bunnyEars2(bunnies-1)+2;
		}
	}
	public static void main(String args[])
	{
	
	}
}
 