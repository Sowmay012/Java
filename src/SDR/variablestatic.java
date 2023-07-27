package SDR;
class student1
{
	int rollno;
	String name;
	static  String college="IT";
	student1(int r,String n)
	{
		rollno=r;
		name=n;
	}	
	void display()
	{
		System.out.println(rollno+":"+name+":"+college);
	}
	
}
public class variablestatic {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		student1 s1=new student1(10,"Satya");
		student1 s2=new student1(20,"Kanth");
		s1.display();
		s2.display();	
	}

}
