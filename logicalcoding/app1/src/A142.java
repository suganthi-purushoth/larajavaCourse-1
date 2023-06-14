class A142 
{
	public static void main(String[] args) 
	{
		int m=0;
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=6;j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i+m ;j++ )
			{
				System.out.print("1 ");
			}
			m++;
			System.out.println();
		}
		int n=10;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=n-i;j>=1 ;j-- )
			{
				System.out.print("1 ");
			}
			n--;
			System.out.println();
		}
	}
}
