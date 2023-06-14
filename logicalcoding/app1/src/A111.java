class A111 
{
	public static void main(String[] args) 
	{
		int m=7;
		for (int i=0; i<=3;i++ )
		{
			for (int j=0;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=0;j<m-i ;j++ )
			{
				System.out.print("1 ");
			}
			m--;
			System.out.println();
		}
	}
}
