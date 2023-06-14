class A59 
{
	public static void main(String[] args) 
	{
		for (int i=5;i>=0 ;i-- )
		{
			for (int j=(i-1); j>=0;j-- )
			{
				System.out.print((i==5 || j==i)?"0 ":(j+" "));
			}
			System.out.println();
		}
	}
}
