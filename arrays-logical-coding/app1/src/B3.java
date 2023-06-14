class B3 
{
	public static void main(String[] args) 
	{
		int[] array = {1,5,2,6,9,1,0,3,4,5,13};
		//             0 1 2 3 4 5 6 7 8 9 10
		System.out.println(array[8]);
		System.out.println(array[9]);
		System.out.println(array[10]);
		// or
		System.out.println(array[array.length - 3]);
		System.out.println(array[array.length - 2]);
		System.out.println(array[array.length - 1]);
	}
}
