class A94 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=i;j>=1 ;j-- )
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int i=6;i<=9 ;i++ )
		{
			for (int j=9;j>=i ;j-- )
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
