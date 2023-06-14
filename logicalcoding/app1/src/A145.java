class A145 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=6;j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i ;j++ )
			{
				System.out.print((j==1 || j==i || i==6)?(j+" "):("  "));
			}
			for (int j=i-1;j>=1 ;j-- )
			{
				System.out.print((j==1 ||i==6)?(j +" "):("  "));
			}
			System.out.println();
		}
		for (int i=5;i>=1 ;i-- )
		{
			for (int j=5;j>=i ;j-- )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i ;j++ )
			{
				System.out.print((j==1 || j==i)?(j +" "):("  "));
			}
			for (int j=(i-1);j>=1 ;j-- )
			{
				System.out.print((j==1)?(j +" "):("  "));
			}
			System.out.println();
		}
	}
}
