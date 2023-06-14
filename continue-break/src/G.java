class class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i<= 10; i++)
		{
			System.out.println("loop body begin: "+ i);
			if(i==4)
			{
				System.out.println("if begin");
				break;//(break, continue or return will be the last statement)
				i++; //other wise get error
			}
			System.out.println("loop body end: "+ i);
		}
		System.out.println("main end");
	}
}
