import java.util.Arrays;
class A54 
{
	public static void main(String[] args) 
	{
		int[] elements = {10,5,13,16,4,7,20,18};
		System.out.println("initial:" +Arrays.toString(elements));
		int temp;
		for (int i=0;i<elements.length/2 ;i++)
		{
			temp=elements[i];
			elements[i] = elements[elements.length- i - 1];
			elements[elements.length - i - 1] = temp;
		}
		System.out.println("final:" +Arrays.toString(elements));
	}
}
