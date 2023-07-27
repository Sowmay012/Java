package SDR;

public class paramconst {
	int id;
	String name;
	paramconst(int i,String n)
	{
		id=i;
		name=n;
	}
	public void display() {
		System.out.println(id+":"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paramconst d=new paramconst(10,"Janu");
		d.display();
		
	}

}
