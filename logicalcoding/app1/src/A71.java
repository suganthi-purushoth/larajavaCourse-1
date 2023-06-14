class A71 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=i;j>1 ;j-- )
			{
				System.out.print("  ");
			}
			for (int k=6;k>=i ;k-- )
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
