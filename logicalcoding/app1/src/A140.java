class A140 
{
	public static void main(String[] args) 
	{
		int m=0;
		char n='s';
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=5;j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i+m ;j++ )
			{
				System.out.print((j==1)?("r"):((j==i+m)?(n++ +" "):("  ")));
			}
			m++;
			System.out.println();
		}
	}
}
