package SDR;
class javapoint
{
	private int i;
	javapoint(){}
	javapoint(int i){
		this.i=i;
	}
	public int getValue()
		{
			return i;
		}
	public void setValue(int i)
	{
		this.i=i;
	}
	@Override
	public String toString() 
	{
		return Integer.toString(i);
	}
}

public class wrapperclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		javapoint j=new javapoint(10);
		System.out.println(j);
	}

}
