public class car extends vehicle{
	private boolean automatic;
	public car(boolean automatic,int wheels, int motor, String name, String model,String ID)
	{
		super(wheels, motor, name,model,ID);
		this.automatic=automatic;
		
	}
	public boolean getAutomatic()
	{
		return automatic;
	}
}