class A139 
{
	public static void main(String[] args) 
	{
		int m=0;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=5;j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i+m ;j++ )
			{
				System.out.print((j==i+m || j==1)?("1 "):("  "));
			}
			m++;
			System.out.println();
		}
	}
}
