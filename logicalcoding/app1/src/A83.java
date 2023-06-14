class A83 
{
	public static void main(String[] args) 
	{
		for (int i=7;i>=1 ;i-- )
		{
			for (int j=1;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int k=i;k<=7 ;k++ )
			{
				System.out.print(( k==i || k==7)?(k+" "): "0 ");
			}
			System.out.println();
		}
	}
}
