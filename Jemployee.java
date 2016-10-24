public class Jemployee
{
	public String name;

	private double salary;

	public Jemployee(String empName)
	{

		name = empName;

	}

	public void empSalary(double empSalary)
	{

		salary = empSalary;

	}

	public void printEmployee()
	{

		System.out.println("Name = " +name );
		System.out.println("Salary = $" +salary);

	}

	public static void main(String args[])
	{

		Jemployee empOne = new Jemployee("Ranshika");
		empOne.empSalary(10000);
		empOne.printEmployee();

	}

}
