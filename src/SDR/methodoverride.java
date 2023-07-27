package SDR;
class Bank
{
	int getRateOfIntrest()
	{
		return 0;
		
	}
	
}
class SBI extends Bank
{
	int getRateOfIntrest()
	{
		return 7;
	}
}
class ICIC extends Bank
{
	int  getRateOfIntrest()
	{
		return 8;
	}
}

class AXIS extends Bank
{
	int  getRateOfIntrest()
	{
		return 9;
	}
}

public class methodoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		ICIC i=new ICIC();
		AXIS a=new AXIS();
		System.out.println("SBI Rate of Intrest"+s.getRateOfIntrest());
		System.out.println("ICIC Rate of Intrest"+i.getRateOfIntrest());
		System.out.println("AXIS Rate of Intrest"+a.getRateOfIntrest());
		
		

	}

}
