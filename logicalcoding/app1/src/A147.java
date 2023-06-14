class A147 
{
	public static void main(String[] args) 
	{
		int m=0;
		for (int i=1;i<=7 ;i++ )
		{
			for (int j=7;j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i+m ;j++ )
			{
				System.out.print((j==1 || j==i+m ||j==1+4 ||j==1+8)?("1 "):("  "));
			}
			m++;
			System.out.println();
		}
		int n=12;
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=n-i;j>=1 ;j-- )
			{
				System.out.print((j==n-i || j==1 || j==1+4 || j==1+8)?("1 "):("  "));
			}
			n--;
			System.out.println();
		}
	}
}
