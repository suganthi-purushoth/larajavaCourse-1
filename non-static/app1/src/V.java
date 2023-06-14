class V 
{
	int i;
	static V test() // method return type can class type
	{
		return new V(); //while returning also we can create an object 
	}
	public static void main(String[] args) 
	{
		V v1 = test();  //test method now having V class object
		System.out.println(v1.i);
	}
}
/*
1.if you find anywere 'new classname();' then definetly it is creation of object only
*/