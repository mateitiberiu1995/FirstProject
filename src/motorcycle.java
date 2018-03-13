public class motorcycle extends vehicle{
	private int topSpeed;
	public motorcycle(int topSpeed, int wheels, int motor, String name, String model,String ID)
	{
		super(wheels,motor, name, model,ID);
		this.topSpeed=topSpeed;
	}
	public int getTopSpeed()
	{
		return topSpeed;
	}
}