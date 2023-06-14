class A126 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			char n='a';
			for (int j=5;j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i ; j++)
			{
				System.out.print((j==1 || j==i)?("1 "):(n++ +" "));
			}
			System.out.println();
		}
		for (int i=1;i<=4 ;i++ )
		{
			char n='a';
			for (int j=1;j<=i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=4;j>=i ;j-- )
			{
				System.out.print((j==4 || j==i)?("1 "):(n++ +" "));
			}
			System.out.println();
		}
	}
}
