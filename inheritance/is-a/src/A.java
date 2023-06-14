//single inheritance
//Java supports single inheritance,meaning a class can inherits from only one superclass.
//parent//base//super-class
class A 
{
	int i;
}
//child//derived//sub-class
//extends is a keyword
//one class can able to extend another class at a time.
//at a time a class can able to extend only one class
class B extends A
{
    int j;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
/*
inheritance is a process of aqiring the properties and behaviours from another class.
by using inheritance we can achieve code reusability.
inheritance is a fundamental concept in object-oriented programming (OOP) that allows 
class to inherit properties and behaviour from other class.
*/