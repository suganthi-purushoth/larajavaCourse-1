class A75 
{
	public static void main(String[] args) 
	{
		for (int i=7;i>=1 ;i-- )
		{
			for (int j=7;j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (int k=i; k>=1;k-- )
			{
				System.out.print(k +" ");
			}
			System.out.println();
		}
	}
}
