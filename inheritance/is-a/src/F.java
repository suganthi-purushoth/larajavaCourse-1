class E 
{
	static int i;
}
class F extends E
{
	static int j;
	public static void main(String[] args) 
	{
		System.out.println(F.i);
		System.out.println(F.j);
	}
}
/*
static variables are also inheriting to the subclass from the superclass.
by using subclass reference only we can access static members of subclass. no need of creating object.
even by creating object to subclass also we can access static variables.
*/