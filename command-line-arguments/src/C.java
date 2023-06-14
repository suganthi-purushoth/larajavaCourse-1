class C 
{
	public static void main(String[] args) 
	{
		System.out.println("Total arguments: " +args.length);
		for (String arg : args )
		{
			System.out.println(arg);
		}
	}
}
/*
1.JVM will be calling the main method by suppling empty string array
object if you don't supply anything as a command line argument while
executing any class.
2.if you directly print the array reference you will be grtting the memory
address of that array object.
3.each and every array will be having a length.we can find out the array
length by using 'length' property (by calling length property on the array reference).
4.arrays are also objects in java.
5.array index will be starting from 0 but length we will calculate from no.1 .
6.if there are no elements are present in the array then we can say that array is empty or (size or length is 0).
7.by default whatever the value you are supplying as command line argument that will be consider as string type only.
*/