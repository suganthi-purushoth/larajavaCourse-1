package pack1;
class  A
{
	private int i;
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
	}
}

/* 
access specifiers == access modifiers

we can  have control over the data, which one should be shared and which
one should not be over package structure 

the access specifiers in java maintains the accessibility or scope of a field,
method, constructor, or class or interface
*/
//private  || default || protected || public
//default == package == friendly
/*
1.private member can accesses within class only
2.the scope of private member is within the decleared class.
3.private member cannot asscessed out of the class.
*/
