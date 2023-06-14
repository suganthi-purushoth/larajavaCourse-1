class A134 
{
	public static void main(String[] args) 
	{
		for (char i='p';i<='t' ;i++ )
		{
			for (char j='t';j>=i ;j-- )
			{
				System.out.print((j==i)?(i +" "):("  "));
			}
			System.out.println();
		}
		for (char i='u';i<='x' ;i++ )
		{
			for (char j='t';j<=i ;j++ )
			{
				System.out.print((j==i)?(i+" "):("  "));
			}
			System.out.println();
		}
	}
}
