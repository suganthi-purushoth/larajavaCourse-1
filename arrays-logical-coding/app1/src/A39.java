class A39 
{
	public static void main(String[] args) 
	{
		int[] array = {1,5,6,4,8,5,3,4,5,8};
		//                  0 1 2 3 4 5 6 7 8 9 
		for (int i=0;i< array.length-2 ;i++ )
		{
			if ((array[i] % 2 == 0) && (array[i+2] % 2 == 0))
			{
				System.out.print(array[i+1] + ",");
			}
		}
	}
}
