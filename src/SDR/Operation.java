package SDR;

public class Operation {

	int data=50;
	void change(int data) 
	{
			data=data+100;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Operation op=new Operation();
		System.out.println("Before Change"+op.data);
		op.change(500);
		System.out.println("After Change"+op.data);
	}

}
