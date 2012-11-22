//package se.marathon.oskar;

public class Participator
{
	private int age;
	private int time;
	private String name;
	private String country;
	private int startNumber;

	// Utan tid
	public Participator(int age, String name, String country, int startNumber)
	{
		this.age = age;
		this.name = name;
		this.country = country;
		this.startNumber = startNumber;
	}
	
	// Med time
	public Participator(int age, String name, int time, String country, int startNumber)
	{
		this.age = age;
		this.name = name;
		this.time = time;
		this.country = country;
		this.startNumber = startNumber;
	}

	public int getAge()
	{
		return age;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getStartNumber()
	{
		return startNumber;
	}
	
	public int getTime()
	{
		return time;
	}
	
	public void setTime(int time)
	{
		this.time = time;
	}

}
