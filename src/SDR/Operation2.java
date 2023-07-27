package SDR;

public class Operation2 {

	int data=50;
	void change(Operation2 op) 
	{
			op.data=op.data+100;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Operation2 op=new Operation2();
		System.out.println("Before Change"+op.data);
		op.change(op);
		System.out.println("After Change"+op.data);
	}

}
