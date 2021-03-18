import java.util.Arrays;

class Employee
{
	private String name;
	public Employee(String name)
	{
		this.name = name;
	}
	public boolean equals(Employee other)
	{
		return name.equals(other.name);
	}
}

public class TestJava
{
	public static void main(String[] args)
	{
		Employee harry = new Employee("harry");
		Employee boss = new Employee("ren");
		System.out.println(harry.equals(boss));
	}
}