package hu.unicon.oop;

public class Employee
{
	
	public Employee(String name, int age, int salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Employee(String name, int age)
	{
		this(name, age, 100);
	}
	
	public Employee() {}
	
	
	
	@Override
	public String toString()
	{
		// super.toString();
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public void incrSalary()
	{
		salary += 5000;
	}
	
	public void incrSalary(int value)
	{
		salary += value;
	}
	
	public void incrSalary(double value)
	{
		salary += salary * (value / 100);
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		if(name.length() > 0) this.name = name;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public int getSalary() 
	{
		return salary;
	}
	
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	
	private String name;
	private int age;
	private int salary;
}
