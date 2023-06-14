class A123 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=5;j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i ; j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		for (int i=1;i<=4 ;i++ )
		{
			int n=i*2+1;
			for (int j=1;j<=i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=4;j>=i ;j-- )
			{
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}
}
