class  Car
{
	private String make;
	private String model;
	private int year;
	public String getMake()
	{
	return make;
	}
   public String getModel()
	{
	return model;
	}
	public int getYear()
	{
	return year;
	}
	//write-only//setter methods
	public void setMake(String make)
	{
		this.make=make;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public void setYear(int year)
	{
		this.year=year;
	}


}
class CarDriver
{
	public static void main(String[] args)
	{
		Car car = new Car();
		car.setMake("Toyota");
		car.setModel("Camry");
		car.setYear(2020);
		String make = car.getMake();
		String model = car.getModel();
		int year=car.getYear();
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("year: "+year);
	}
}