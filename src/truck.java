public class truck extends vehicle{
	private int load;
	public truck(int load, int wheels, int motor, String name, String model,String ID)
	{
		super(wheels,motor, name, model,ID);
		this.load=load;
	}
	public int getLoad()
	{
		return load;
	}
}