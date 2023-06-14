class A135 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=7 ;i++ )
		{
			for (int j=i;j>=1 ;j-- )
			{
				System.out.print((j==1)?("1 "):("  "));
			}
			System.out.println();
		}
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=6;j>=i ;j-- )
			{
				System.out.print((j==i)?("1 "):("  "));
			}
			System.out.println();
		}
	}
}
