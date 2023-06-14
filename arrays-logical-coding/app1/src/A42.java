class A42 
{
	public static void main(String[] args) 
	{
		int[] array = {1,4,6,7,8,5,10,4,2,8};
		//                  0 1 2 3 4 5 6 7 8 9 
		for (int i=0;i< array.length-1 ;i++ )
		{
			if ((array[i] % 2 == 0) && (array[i+1] % 2 == 0))
			{
				System.out.print(array[i] + ",");
				System.out.print(array[i+1] + ",");
				System.out.println();
			}
		}
	}
}
