class A132 
{
	public static void main(String[] args) 
	{
		for (int i=9;i>=5 ;i-- )
		{
			for (int j=5;j<=i ;j++ )
			{
				System.out.print((j==i)?(i +" "):("  "));
			}
			System.out.println();
		}
		for (int i=6;i<=9 ;i++ )
		{
			for (int j=5;j<=i ;j++ )
			{
				System.out.print((j==i)?(i+" "):("  "));
			}
			System.out.println();
		}
	}
}
