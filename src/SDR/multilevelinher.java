package SDR;
class Animal1
	{
	
	void eat(){
		System.out.println("Eating");
		}
		
	}

class Dog1 extends Animal1
	{
		void bark()
		{
			System.out.println("Barking");
		}
	}

class babyDog extends Dog1
{
	void weep() 
	{
		System.out.println("Weeping");
	}
}
public class multilevelinher {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		babyDog b=new babyDog();
		b.weep();
		b.bark();
		b.eat();
	}

}
