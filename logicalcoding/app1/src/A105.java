class A105 
{
	public static void main(String[] args) 
	{
		int m=0;
		for (int i=9;i>=5 ;i-- )
		{
			for (int j=5; j<i;j++ )
			{
				System.out.print("  ");
			}
			for (int j=i-m;j<=9 ;j++ )
			{
				System.out.print(j +" ");
			}
			m++;
			System.out.println();
		}
	}
}
