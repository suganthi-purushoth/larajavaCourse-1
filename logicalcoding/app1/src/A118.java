class A118 
{
	public static void main(String[] args) 
	{
		char m='p';
		int o=10;
		for (int i=1; i<=5;i++ ,m++)
		{
			char n=m;
			for (int j=1;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=o-i ;j++,n++)
			{
				System.out.print((j==1||j==o-i)?(n +" "):("0 "));
			}
			o--;
			System.out.println();
		}
	}
}
