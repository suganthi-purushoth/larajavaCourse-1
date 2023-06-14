class N13 
{
	public static void main(String[] args) 
	{
		int i=12431,m=0;
		while (i!=0)
		{
			if ((i %10)%2==0)
			{
				++m;
			}
			i=i/10;
		}
		System.out.println(m);
	}
}
