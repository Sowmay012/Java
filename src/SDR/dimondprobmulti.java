package SDR;

class A
{
	public void display()
	{
		System.out.println("Class A display");
	}
}
class B extends A
{
	@Override  

	public void display()
	{
		System.out.println("Class B display");
	}
}

class C extends A
{
	@Override  

	public void display()
	{
		System.out.println("Class C display");
	}
}


public class dimondprobmulti extends B,C
{
	public static void main(String args[])
	{
	
		
		dimondprobmulti d= new dimondprobmulti();
		
		d.display();
	}
}