class A21 
{
	public static void main(String[] args) 
	{
		int[] array = {1,5,2,6,9,1,0,3,4,5};
		//             0 1 2 3 4 5 6 7 8 9 
		int sum = 0;
		
		for (int i =array.length-1;i>=array.length/2;i--)
		{
			sum +=array[i];
		}
		double alh = array.length/2 ;
		double avg = (double) sum/alh;
		System.out.println("avg: " + avg);
	}
}

