class A85 
{
	public static void main(String[] args) 
	{
		for (int i=7;i>=1 ;i-- )
		{
			for (int j=1;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int k=i;k<=7 ;k++ )
			{
				System.out.print((i==1 || k==7 || k==i)?(i+" "):"0 ");
			}
			System.out.println();
		}
	}
}
