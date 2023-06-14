class A110 
{
	public static void main(String[] args) 
	{
		int m=0;
		char n='a';
		for (int i=0;i<=5 ;i++ )
		{
			for (int j=5;j>i ; j--)
			{
				System.out.print("  ");
			}
			for (int j=i+m;j>=0 ;j-- )
			{
				System.out.print((j==0)?(n++):((j==i+m)?("a "):(j +" ")));
			}
			m++;
			System.out.println();
		}
	}
}
