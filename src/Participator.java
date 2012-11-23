public class Participator
{
private int age;
private double time;
private String name;
private String country;
private int startNumber;

// Utan tid
public Participator(int age, String name, String country)
{
this.age = age;
this.name = name;
this.country = country;

}

// Med time
//public Participator(int age, String name, double time, String country, int startNumber)
//{
//this.age = age;
//this.name = name;
//this.time = time;
//this.country = country;
//this.startNumber = startNumber;
//}

public Participator (double time){
	this.time = time;
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

public double getTime()
{
return time;
}

public void setTime(int time)
{
this.time = time;
}


	
}

