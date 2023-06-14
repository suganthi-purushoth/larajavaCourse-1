class A119 
{
	public static void main(String[] args) 
	{
		int m=10;
		for (int i=1;i<=5 ;i++ )
		{
			int n=1;
			for (int j=1;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=m-i;j>=1 ;j-- )
			{
				System.out.print((i%2 !=0)?(j+ " "):(n++ + " "));
			}
			m--;
			System.out.println();
		}
	}
}
