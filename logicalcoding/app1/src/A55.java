class A55 
{
	public static void main(String[] args) 
	{
		for (int i=6;i>=1 ;i-- )
		{
			for (int j=i;j>=1 ;j-- )
			{
				System.out.print((j==i || j==1 || i==6) ?"0 ": "1 " );
			}
			System.out.println();
		}
	}
}
