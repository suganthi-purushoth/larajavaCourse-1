class A19 
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=7 ;i++ )
		{
			for (int j=6;j>=1 ;j-- )
			{
				System.out.print((i==1 || i==7 || j==1 || j==6) ? "0 " : ((j+i)-3) + " ");
			}
			System.out.println();
		}
	}
}
