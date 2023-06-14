class B 
{
	B()
	{
		System.out.println("B()");
	}

	{
		System.out.println("IIB");
	}
	public static void main(String[] args)
	{
		B b1 = new B();
		System.out.println("-----------");
		B b2 = new B();
		System.out.println("-----------");
	}
}
/*
IIB == Instance Initialization Block
1.IIB block can be developed outside of any method and inside the class.
2.before the execution of constructor IIB blocks will be executing from top to bottom
only once for one object creation.
3.IIB blocks are non-static
4.we can create any number of IIB blocks
5.if you are creating IIB blocks inside of any other blocks then that will be not considered as IIB block,
it will be  a normal block.
6.Need of IIB block: if there is any common implementation for objects,
*/