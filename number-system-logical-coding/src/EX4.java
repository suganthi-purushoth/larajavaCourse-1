/*
class EX4 
{
	public static void main(String[] args) 
	{
		int i, j=0,k=24365651;
		for (i=24365651;i!=0 ;i/=10 )
		{
			j++;
		}
		System.out.println("total number of digits of given value "+k +" is "+ j);
	}
}

*/

class EX4 
{
	public static void main(String[] args) 
	{
		int i=-24365651,j=i,k=0;
		while(i!=0)
		{
			k++;
			i = i/10;
		}
		System.out.println("total number of digits of given value "+j +" is "+ k);
	}
}
