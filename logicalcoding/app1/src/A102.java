class A102 
{
	public static void main(String[] args) 
	{
		int m=0;
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=6; j>i;j-- )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i+m ;j++ )
			{
				System.out.print((j==1|| i==6 || j==i+m)?("1 "):("0 "));
			}
			m++;
			System.out.println();
		}
	}
}
