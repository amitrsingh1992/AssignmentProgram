class Animal
{

	public void move()
	{

		System.out.println("Animal can walk.");

	}

}

class Dog extends Animal
{

	public void move()
	{

		System.out.println("Dog can run and walk.");

	}

	public void bark()
	{

		System.out.println("Dog can Bark as well.");

	}
}

public class TestDog1
{

	public static void main(String[] args)
	{

		Animal a = new Animal();
		Animal b = new Dog();
		//Dog    c = new Dog();	/*needed if we have to perform extra                                              features which are only in Dog class*/
		a.move();
		b.move();
		//c.bark();
	}

}
