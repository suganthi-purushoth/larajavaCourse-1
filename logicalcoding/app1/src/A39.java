class A39 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<=6 ;i++ )
		{
			for (int j=0;j<=i ; j++)
			{
				System.out.print((j==0) ? "0 " : (j + " "));
			}
			System.out.println();
		}
	}
}
