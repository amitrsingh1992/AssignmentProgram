class Animal
{

public void move()
{

System.out.println("Animal can walk");

}

}

 class Dog extends Animal
{

public void move()
{

System.out.println("Dog can run and walk");

}

}

public class TestDog
{

public static void main(String[] args)
{

Animal a = new Animal();
Animal b = new Dog();

a.move();
b.move();

}

}
