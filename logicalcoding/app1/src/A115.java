class A115 
{
	public static void main(String[] args) 
	{
		int m=10;
		for (int i=1; i<=5;i++ )
		{
			for (int j=1;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=m-i ;j++ )
			{
				System.out.print((i==1 || j==1 || j==m-i)?("1 "):("0 "));
			}
			m--;
			System.out.println();
		}
	}
}
