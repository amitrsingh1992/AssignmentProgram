import java.io.*;

public class Employee
{

	String name; 
	int age;
	double salary;
	String Designation;

	public Employee(String name)
	{
		this.name = name;
	}

	public void empAge(int empAge)
	{
		age = empAge;
	}

	public void empSalary(double empSalary)
	{
		salary = empSalary;
	}

	public void empDesignation(String empDesig)
	{
		Designation = empDesig;
	}

	public void printEmployee()
	{

		System.out.println("Name = " +name);
		System.out.println("Age = " +age);
		System.out.println("Designation = " +Designation);
		System.out.println("Salary = $" +salary);

	}

}
