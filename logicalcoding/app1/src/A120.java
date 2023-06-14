class A120 
{
	public static void main(String[] args) 
	{
		int m=10;
		for (int i=1;i<=5 ;i++ )
		{
			int k=i,l=m-2 ;
			for (int j=1;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=m-i;j>=1 ;j-- )
			{
				System.out.print((i%2!=0)?(k++ +" "):(l-- + " "));
			}
			m--;
			System.out.println();
		}
	}
}
