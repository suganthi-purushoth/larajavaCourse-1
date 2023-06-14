class O 
{
	int i;
	public static void main(String[] args) 
	{
		O o1 = new O();
		O o2 = o1;
		System.out.println(o1.i);
		System.out.println(o2.i);
		o1.i = 10;
		System.out.println(o2.i);
		o2.i = 20;
		System.out.println(o1.i);
	}
}
/*
1.one object can have any no.of references.
2.one object can be pointed by any no.of references.
3.change in one reference reflecting to all the reference
that are pointing to that object
4.a reference can point to only one object at a time.
*/