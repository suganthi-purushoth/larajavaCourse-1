class G17 
{
	public static void main(String[] args) 
	{
		{
			{
				int i=10;
				System.out.println("inner Normal block:" +i);
			}
			System.out.println("outer Normal block:" +i);
		}
		System.out.println(" main end:" +i);
	}
}
