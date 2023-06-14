class N12 
{
	public static void main(String[] args) 
	{
		int i=2508;
		int m=0;
		while (i>0)
		{
			i/=10;
			++m;
		}
		System.out.println(m);
	}
}
