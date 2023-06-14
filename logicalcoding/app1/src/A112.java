class A112 
{
	public static void main(String[] args) 
	{
		int m=8;
		for (int i=1; i<=4;i++ )
		{
			for (int j=1;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=m-i ;j++ )
			{
				System.out.print(i +" ");
			}
			m--;
			System.out.println();
		}
	}
}
