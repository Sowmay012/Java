package SDR;
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


public class muldimpro extends B,c
{
	public static void main(String args[])
	{
		muldimpro m=new muldimpro();
		m.display();
	}
}
