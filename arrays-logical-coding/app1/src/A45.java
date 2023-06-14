class A45
{
	public static void main(String[] args) 
	{
		int[] array = {-7,5,6,7,9,-5,4,3,1,8};
		//                  0 1 2 3 4 5 6 7 8 9 
		for (int i=0;i< array.length-1 ;i++ )
		{
			for (int j=i+1;j<=array.length-1 ;j++ )
			{
				if (((array[i] ) + (array[j])) == 0)
			{
				System.out.print(array[i] + ",");
				System.out.print(array[j] + ",");
				System.out.println();
			}
			}
		}
	}
}
