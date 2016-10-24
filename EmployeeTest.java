import java.io.*;

public class EmployeeTest
{

	public static void main(String args[])
	{

		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("Mary Anne");

		//Invoking methods for each object created 
                System.out.println("\n");
		empOne.empAge(26);
		empOne.empDesignation("Jr. Software Developer");
		empOne.empSalary(26000);
		empOne.printEmployee();
		System.out.println("\n");
		empTwo.empAge(35);
		empTwo.empDesignation("Sr. Software Developer");
		empTwo.empSalary(42000);
		empTwo.printEmployee();
                System.out.println("\n");

	}

}
