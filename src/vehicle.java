public class vehicle{
	private int wheels;
	private String name;
	private int motor;
	private String model;
	private String ID;
	public vehicle(int wheels, int motor, String name, String model,String ID)
	{
		this.name=name;
		this.wheels=wheels;
		this.motor=motor;
		this.model=model;
		this.ID=ID;
	}
	public String getName()
	{
		return name;
	}
	public String getModel()
	{
		return model;
	}
	public int getMotor()
	{
		return motor;
	}
	public int getWheels()
	{
		return wheels;
	}
	public String getID()
	{
		return ID;
	}
}