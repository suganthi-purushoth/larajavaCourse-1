import java.util.*;
class A7 
{
	public static void main(String[] args) 
	{
		int [] array = new int[14];
		array[(array.length -1)/2] = 41;
		array[((array.length -1)/2)-3] = 76;
		array[((array.length -1)/2)+2] = 65;
		System.out.println(Arrays.toString(array));
		System.out.println(array[(array.length -1)/2]+array[((array.length -1)/2)-3]+array[((array.length -1)/2)+2] );
	}
}
