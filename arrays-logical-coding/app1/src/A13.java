class A13 
{
	public static void main(String[] args) 
	{
		int[] array = {1,5,2,6,9,1,0,3,4,5};
		//             0 1 2 3 4 5 6 7 8 9 
		for (int i =0;i<array.length-1;i+=2)
		{
			System.out.println(array[i]);
		}
	}
}
