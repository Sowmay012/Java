package SDR;

class Animal2
	{
	
	void eat(){
		System.out.println("Eating");
		}
		
	}

class Dog2 extends Animal2
	{
		void bark()
		{
			System.out.println("Barking");
		}
	}

class Cat1 extends Animal2
{
	void meow() 
	{
		System.out.println("meow");
	}
}


public class hierarchicalinhe {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Cat1 c=new Cat1();
		Dog2 d=new Dog2();
		c.meow();
		c.eat();
		d.bark();
		d.eat();
	}

}
