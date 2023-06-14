class A38 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=8 ;i++ )
		{
			for (int j=i;j>=1 ; j--)
			{
				System.out.print((i==8 || j==1 || j==i) ? "0 " : ( (j-1)+" "));
			}
			System.out.println();
		}
	}
}
