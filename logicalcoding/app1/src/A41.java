class A41 
{
	public static void main(String[] args) 
	{
		for (int i=7;i>=1 ;i-- )
		{
			for (int j=i;j<=7 ;j++ )
			{
				System.out.print((j==7) ? "0 " : (j + " "));
			}
			System.out.println();
		}
	}
}
