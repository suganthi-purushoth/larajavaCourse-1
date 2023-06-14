class A44
{
	public static void main(String[] args) 
	{
		int[] array = {1,5,6,7,9,5,4,3,7,8};
		//                  0 1 2 3 4 5 6 7 8 9 
		for (int i=0;i< array.length-2 ;i++ )
		{
			if (((array[i] ) + (array[i+1])) == (array[i+2]))
			{
				System.out.print(array[i] + ",");
				System.out.print(array[i+1] + ",");
				System.out.print(array[i+2] + ",");
				System.out.println();
			}
		}
	}
}
