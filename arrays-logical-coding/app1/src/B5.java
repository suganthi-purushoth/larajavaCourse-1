class B5 
{
	public static void main(String[] args) 
	{
		int[] array = {1,5,2,6,9,1,0,3,4,5,13};
		//             0 1 2 3 4 5 6 7 8 9 10
		for (int i =0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println();
		//or
		for (int i : array )
		{
			System.out.println(i);
		}
	}
}
