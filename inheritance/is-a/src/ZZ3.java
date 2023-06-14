class A
{
	static
	{
		System.out.println("A-SIB");
	}
}
class B extends A 
	{
	   static 
		{
		   System.out.println("B-SIB");
		}
	}
class C extends B
	{
	   static 
		{
		   System.out.println("C-SIB");
		}
	}
class ZZ3
{
    static
	{
		System.out.println("ZZ3-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main beigin");
		B b1 = new B();
		System.out.println("-------------");
	    C c1 = new C();
		System.out.println("-------------");
		 A a1 = new A();
		 System.out.println("-------------");
		 ZZ3 zz3 = new ZZ3();
		 System.out.println("-------------");
		System.out.println("main end");
	}
}