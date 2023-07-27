package SDR;
class student2{
	int rno;
	String name;
	static String college="Jit";
	static void change()
	{
		college="Bnit";
	}
	student2(int r,String n)
	{
		rno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rno+":"+name+":"+college);
	}
}

public class methodstatic {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		student2.change();
		student2 s1=new student2(1,"Jaya");
		student2 s2=new student2(2,"kanth");
		s1.display();
		s2.display();

	}

}
