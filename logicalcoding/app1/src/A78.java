class A78 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=7 ; i++)
		{
			for (int j=1;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int k=7;k>=i ;k-- )
			{
				System.out.print((i==1 || k==7 ||k==i)?"1 ": "0 ");
			}
			System.out.println();
		}
	}
}
