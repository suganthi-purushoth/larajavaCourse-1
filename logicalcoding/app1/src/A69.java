class A69 
{
	public static void main(String[] args) 
	{
		char k='Z';
		for (int i=5;i>=1 ;i-- )
		{
			for (int j=i;j>=1 ;j-- )
			{
				System.out.print(k-- + " ");
			}
			System.out.println();
		}
	}
}
