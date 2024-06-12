package varibles;
class Animal
{
	void eat()
	{
		System.out.println("animal is eating");
	}

}
class Dog extends Animal
{
	void sleep()
	{
		System.out.println("animal is sleeping");
	}
}
class BabyDog extends Dog
{
	void cry()
	{
		System.out.println("i m crying");
	}
}

public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BabyDog d = new BabyDog();
        d.eat();
        d.sleep();
        d.cry();
	}

}
