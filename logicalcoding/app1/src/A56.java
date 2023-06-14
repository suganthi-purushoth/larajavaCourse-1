class A56 
{
	public static void main(String[] args) 
	{
		for (int i=5;i>=0 ;i-- )
		{
			for (int j=0;j<=i ; j++)
			{
				System.out.print((j==0 || j==i || i==5)?"0 ": (j +" "));
			}
			System.out.println();
		}
	}
}
