
public class CarCustome {
  
 
	
	private String model;
	private String make;
	private int price;
	 private int maxSpeed = 0;

public CarCustome()
{
	model = "";
	
	
}

public CarCustome(String mod,String m, int p, int max)
{
	model = mod;
	make = m;
	price = p;
	maxSpeed = max;
}

public void setModel(String mod)
{
	model = mod;
}

public void setMake(String m)
{
	make = m;
}

public void setPrice(int p)
{
	price = p;
}

public void setSpeed( int max)
{
	maxSpeed = max;
}

public String getModel()
{
	return model;
}

public String getMake()
{
	return make;
}

public int getPrice()
{
	return price;
}

public int getSpeed()
{
	return maxSpeed;
}

boolean isFaster(CarCustome otherCar)
{
	return this.getSpeed() > otherCar.getSpeed ();
}
}
}
