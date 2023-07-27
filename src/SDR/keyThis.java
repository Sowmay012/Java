package SDR;
class student3
{
	int rn;
	String name;
	float fee;
	student3(int rn,String name,float fee)
	{
		this.rn=rn;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rn+":"+name+":"+fee);
	}
	
	
}

public class keyThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student3 s3=new student3(10,"Na",1000);
		student3 s4=new student3(20,"la",2000);
		s3.display();
		s4.display();
	}

}
