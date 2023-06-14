class A15 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=1;j<=6 ;j++ )
			{
				System.out.print((i==1 ||i==6 || j==1 || j==6) ? "0 " : "1 ");
			}
			System.out.println();
		}
	}
}
