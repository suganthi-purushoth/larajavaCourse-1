class A137 
{
	public static void main(String[] args) 
	{
		int m=13;
		for (int i=1; i<=7;i++ )
		{
			for (int j=1;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=2;j<=m-i ;j++ )
			{
				System.out.print((j==2 || j==m-i)?("1 "):("  "));
			}
			m--;
			System.out.println();
		}
	}
}
