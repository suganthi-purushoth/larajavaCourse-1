class A89 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=6;j>i ;j-- )
			{
				System.out.print("  ");
			}
			int n=0;
			for (int k=1;k<=i ;k++ )
			{
				System.out.print((k==i || k==1 || i==6)?("P "):(n++ +" "));
			}
			System.out.println();
		}
	}
}
