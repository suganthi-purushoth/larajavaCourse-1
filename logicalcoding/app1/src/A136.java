class A136 
{
	public static void main(String[] args) 
	{
		for (char i='i';i<='o' ;i++ )
		{
			for (char j='i';j<=i ;j++ )
			{
				System.out.print((j==i)?(j+" "):("  "));
			}
			System.out.println();
		}
		for (char i='p';i<='u' ;i++ )
		{
			for (char j='u';j>=i ;j-- )
			{
				System.out.print((j==i)?(j+" "):("  "));
			}
			System.out.println();
		}
	}
}
