class N 
{
	N()
	{
		System.out.println("N()");
	}
	N(int i)
	{
		this();
		System.out.println("N(int)");
	}
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("-------------");
		N n2 = new N(10);
		System.out.println("-------------");
	}
}
/*
1.in every constructor body the first statement would be super()
calling statement.(if the programmer didn't keep super or this calling statement explicitely)
2.each and every class is a subclass to object class (wheather directly or indirectly)
3.Object class is the super most class in java.
4.some of the commonely required members are inherited to the sub-classes from the object class.
5.super calling statement is calling the object class no argument constructor.
6.in the object class we have one constructor which is no argument constructor, 
and we don't have any statement inside that constructor.
7.super statement will be always calling the super class constructor .
8.super and this statements comes under non-static.
9.this calling statement always calls the current class constructor not the super class constructor.
10.if we only kept super() , or super with any argument then compiler will not be keeping super().
11.in the constructor body only either or super calling statement not both.
*/