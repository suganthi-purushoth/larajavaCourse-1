class A124 
{
	public static void main(String[] args) 
	{
		for (int i=9;i>=5 ;i-- )
		{
			for (int j=5;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=i;j<=9 ; j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		for (int i=6;i<=9 ;i++ )
		{
			for (int j=6;j<=i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=i;j<=9 ;j++ )
			{
				System.out.print((i==8)?(j-1 +" "):(j +" "));
			}
			System.out.println();
		}
	}
}
