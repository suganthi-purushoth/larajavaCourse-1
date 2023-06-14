class A35 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=8 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print((j==1 || j==i || i==8) ? "1 " : "0 ");
			}
			System.out.println();
		}
	}
}
