class A133 
{
	public static void main(String[] args) 
	{
		for (char i='a';i<='e' ;i++ )
		{
			for (char j='e';j>=i ;j-- )
			{
				System.out.print((j==i)?(i +" "):("  "));
			}
			System.out.println();
		}
		for (char i='f';i<='i' ;i++ )
		{
			for (char j='e';j<=i ;j++ )
			{
				System.out.print((j==i)?(i+" "):("  "));
			}
			System.out.println();
		}
	}
}
