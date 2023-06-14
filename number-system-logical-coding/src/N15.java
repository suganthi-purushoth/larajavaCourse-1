class N15 
{
	public static void main(String[] args) 
	{
		int i=122434,j,temp=0;
		while (i!=0)
		{
				j=i%10;
				temp =(temp * 10) +j;
				i/=10;
		}
		System.out.println(temp);
	}
}