package edu.monmouth.vehicle;

public class Plane implements Vehicle
{
	private String model;
	private PowerTypes powerSource;
	
	public Plane(String f, PowerTypes p)
	{
		setModel(f);
		setPowerSource(p);
	}
	
	public PowerTypes getPowerSource()
	{
		return powerSource;
	}
	
	
	public void setPowerSource(PowerTypes p)
	{
		powerSource = p;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String p)
	{
		 model = p;
	}
	
	@Override
	public PowerTypes powerBy()
	{
		return powerSource;
	}
	
	@Override
	public void go()
	{
		System.out.println("The Plane is taking off");
	}
	
	@Override
	public void stop()
	{
		System.out.println("The plane is landing");
	}
	
	@Override
	public String toString()
	{
		return "Plane [Model=" + model + ", powerSource=" + powerSource + "]";
	}
}
