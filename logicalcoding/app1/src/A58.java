class A58 
{
	public static void main(String[] args) 
	{
		for (int i=5;i>=0 ;i-- )
		{
			for (int j=1; j<=i;j++ )
			{
				System.out.print((i==5 || j==i)?"0 ": (j+" "));
			}
			System.out.println();
		}
	}
}
