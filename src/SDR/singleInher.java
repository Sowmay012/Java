package SDR;
class Animal
{
	void eat(){
	System.out.println("Eating");
	}
	
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}

public class singleInher {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.eat();
		d.bark();
	}

}
