class A130 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=5;j>=i ;j-- )
			{
				System.out.print((j==i)?("1 "):("  "));
			}
			System.out.println();
		}
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=0;j<=i ;j++ )
			{
				System.out.print((j==i)?("1 "):("  "));
			}
			System.out.println();
		}
	}
}
