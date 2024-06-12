package varibles;
class Animal1
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog1 extends Animal1
{
	void sleep()
	{
		System.out.println("i am sleeping");
	}
}
class babydog extends Dog1
{
	 void cry()
	 {
		 System.out.println("crying");
	 }
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       babydog d = new babydog();
        d.eat();
        d.sleep();
        d.cry();
	}

}
