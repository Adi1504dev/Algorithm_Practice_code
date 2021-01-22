package Greedy;

class item{
	double weight,profit;
	double rate;
	item(int i,int j)
	{
		weight=i;
		profit=j;
		rate=profit/weight;
	}
}
public class Kanpsackfractional {
public static void main(String agr[])
{
	item[] i=new item[3];
	i[0]=new item(20,100);
	i[1]=new item(10,60);
	i[2]=new item(30,120);
	double W=50;
	double profit=0;
	item temp=null;
	for(int m=0;m<i.length;m++)
		for(int n=0;n<i.length;n++)
			if(i[m].rate>i[n].rate)
			{
				temp=i[m];
				i[m]=i[n];
				i[n]=temp;
			}
for(item t:i)
{
	if(t.weight<W)
	{
	profit=profit+t.profit;

	W=W-t.weight;
	}
	else
	{
		profit=profit+((W/t.weight)*t.profit);
		
		W=0;
	}
	}

System.out.println(profit);
}
}
