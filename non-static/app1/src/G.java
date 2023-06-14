class G
{
	int i;
	public static void main(String[] args) 
	{
		G g1 = new G();//object creation
		System.out.println(g1.i);/*by using the reference of G class object we can access the non-static variable i.
												  this g1 reference is local to main method	 */
	}
}
/*
1.an object is a real world entity.
2.class is a blue print to create the objects.
3.objects will be having attributes and behaviours.
4.Ex: Dog object properties or attributes:name,age,color,bread,gender,weight.
											 4A.behaviours: bark(),chaseCat(),bite(),chaseVehicle().
5.property also called as data members.
6.behaviour also called as member functions.
7.for one class you can create any no.of object.
8.G g1 = G(class name) ,g1(reference variable name)(name can be anything)
9. = assignment operator(left side assignment)
10. new is a keyword and also an operator
11.G(); - calling G class no argument constructor.
12.variable, method follow the case like variableNumberOne, methodNumberOne.
13.variable name should be valid identifier(if it is variable or reference variable).
14.while you are refering to the class case must be same
15.(as a standard we will write the class name in camel case like ThisIsCamelCase)
16.objects are stored inside heap memory
17.non-static member are loading to the memory while object are created.
18.all the non-static members are loading to the memory while we are creating objects to that particular class.
19.it can be non-static variable or non-static method or it can be a non-static block
*/