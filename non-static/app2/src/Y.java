class Y 
{
	static Y y1 = new Y();
	Y()
	{
		System.out.println("Y()");
	}
	static
	{
		Y y1 = new Y();
		System.out.println("SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("-------");
		Y y2 = new Y();
		System.out.println("-------");
	}
}
// Y y1 = new Y(); this condition will compile (it's not a compile error) it won't to execute.