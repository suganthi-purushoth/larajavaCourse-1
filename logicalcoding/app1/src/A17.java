class A17 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=1;j<=6 ;j++ )
			{
				System.out.print((i==1 || i==6 || j==1 || j==6) ? "0 ":(j+i)-3 + " ");
			}
			System.out.println();
		}
	}
}
