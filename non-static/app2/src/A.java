class A 
{
	A()
	{
		System.out.println("from A()");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("done");
	}
}
/*
1.what is a constructor?
	constructor is a special type of method, but its not a regular method,
	internaly compiler will be considering it a method.
2.	The main difference between a method and constructor is that method
	must have return type, but constructor must not have a return type.
3.	constructor are mainly used for initializing object.
4.	If there are no constructors are defined by the programmer then,
	compiler only keeps a default constructor, In every class, which is 
	no argument constructor (it does not  takes any arguments).
4.	Rules for constructor:
			1. constructor name must be same as class name(which is case-sensetive).
			2. constructors must not have return type.
			3. constructors must be having a body { }.
5.some general points:
			1.constructor can have access specifiers or access modifiers
			2.constructor can take any no.of arguments.
			3.constructor are executed while we are creating the object to that particular class.
			4.while creating the object we need to call the corresponding, available constructor only.
*/