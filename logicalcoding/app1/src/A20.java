class A20 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=6;j>=1 ;j-- )
			{
				System.out.print((i==1 || i==6 || j==1 || j==6) ? "0 " : (((j-i+1) <=0) ? "1 " : (j-i+1) + " " ));
			}
			System.out.println();
		}
	}
}