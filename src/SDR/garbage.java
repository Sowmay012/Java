package SDR;

public class garbage {

	public void finalize()
	{
		System.out.println("Object is garbs collector");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		garbage g1=new garbage();
		garbage g2=new garbage();
		g1=null;
		g2=null;
		System.gc();

	}

}
