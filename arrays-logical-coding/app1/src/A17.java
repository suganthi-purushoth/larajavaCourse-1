/*
class A17 
{
	public static void main(String[] args) 
	{
		int[] array = {1,5,2,6,9,1,0,3,4,5};
		//             0 1 2 3 4 5 6 7 8 9 
		double sum = 0;
		for (int i =0;i<array.length;i++)
		{
			sum +=array[i];
		}
		System.out.println("avg: " + (sum/array.length));
	}
}
*/


class A17 
{
	public static void main(String[] args) 
	{
		int[] array = {1,5,2,6,9,1,0,3,4,5};
		//             0 1 2 3 4 5 6 7 8 9 
		int sum = 0;
		
		for (int i =0;i<array.length;i++)
		{
			sum +=array[i];
		}
		double avg = (double) sum/array.length;
		System.out.println("avg: " + avg);
	}
}

