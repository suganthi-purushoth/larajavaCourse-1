class A36 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=9 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print((j==1 || j==i || i==9) ? "0 ": "1 ");
			}
			System.out.println();
		}
	}
}
