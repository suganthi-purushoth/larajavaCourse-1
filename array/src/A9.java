import java.util.*;
class A9 
{
	public static void main(String[] args) 
	{
		byte [] array = new byte[6];
		int [] arr = new int[7];
		array[((array.length -1)/2) + 1] = 100;
		arr[((arr.length -1)/2) - 1] = array[((array.length -1)/2) + 1];
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arr));
	}
}
