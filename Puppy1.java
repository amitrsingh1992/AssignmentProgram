public class Puppy1
{

	int puppyAge;

	public Puppy1(String name)
	{

		//This constructor has one parameter viz . name.
		System.out.println("Name chosen is :" + name);

	}

	public void setAge(int age)
	{

		puppyAge = age;

	}

	public int getAge()
	{

		System.out.println("Puppy's Age is :" + puppyAge);
		return puppyAge;

	}

	public static void main(String args[])
	{

		/* Object Creation */
		Puppy1 myPuppy = new Puppy1("Tommy");

		/*
		   call class Method to set puppy's age 
		 */
		myPuppy.setAge(2);

		/*call another class method to get puppy's age*/
		myPuppy.getAge();

		/*You can access instance variable as follows as well*/
		System.out.println("Variable Value :" +myPuppy.puppyAge);

	}

}
