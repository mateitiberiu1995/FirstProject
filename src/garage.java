import java.util.ArrayList;
public class garage{
	private ArrayList<vehicle> vehicleList =new ArrayList<vehicle>();
	public void Add(vehicle newVehicle)
	{
		vehicleList.add(newVehicle);
	}
	public void Remove(String ID)
	{
		
		for(int i=0;i<vehicleList.size();i++)
			if(ID==vehicleList.get(i).getID())
			{
				vehicleList.remove(i);
			}
				
	}
	public int Repair(vehicle vehicle)
	{
		//boolean isList = vehicle.class.isAssignableFrom(car);
		boolean isInstance = vehicle instanceof car;
		if(isInstance==true)
		{
			boolean automatic = ((car)vehicle).getAutomatic();
			if(automatic==true)
				return vehicle.getMotor()*100+100;
			else
				return vehicle.getMotor()*100;
		}
		isInstance = vehicle instanceof motorcycle;
		if(isInstance==true)
		{
			int speed=((motorcycle)vehicle).getTopSpeed();
			return vehicle.getMotor()*100+speed/2;
		}
		isInstance = vehicle instanceof truck;
		if(isInstance==true)
			return vehicle.getMotor()*100+((truck)vehicle).getLoad()*10;
		return 0;
	}
	public void emptyGarage()
	{
		while(vehicleList.size()!=0)
		{
			vehicleList.remove(0);

		}
	}
	public void Show()
	{
		for(int i=0;i<vehicleList.size();i++)
		{
			System.out.println(vehicleList.get(i).getID());
			System.out.println(vehicleList.get(i).getName());
			System.out.println(vehicleList.get(i).getModel());
			System.out.println(vehicleList.get(i).getMotor());
			System.out.println(vehicleList.get(i).getWheels());
		}
	}
}
/*car Bmw = new car(true,4,2200,"BMW","x5","abc567");
motorcycle suzuki = new motorcycle(220,4,1500,"suzuki","i50","dsar42");
garage myGarage = new garage();
myGarage.Add(Bmw);
myGarage.Add(suzuki);
myGarage.Show();
myGarage.Remove("dsar42");
myGarage.Show();
System.out.println("ceva");
myGarage.emptyGarage();
myGarage.Show();*/