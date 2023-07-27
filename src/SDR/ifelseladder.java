package SDR;

public class ifelseladder {

	public static void main(String[] args) 
	{
	int per=85;
	if((per>=85)&&(per<=100))
	{
	System.out.println("Distinction");
	}
	else if((per<85)&&(per>=60))
	{
		System.out.println("First class");	
	}
	else if((per<60)&&(per>=50))
	{
		System.out.println("Second class");	
	}
	else if((per<50)&&(per>=35))
	{
		System.out.println("Third class");	
	}
	else if((per<35)&&(per>=0))
	{
		System.out.println("Fail");	
	}
	else
	{
		System.out.println("Invalid input");
		
		
	}

	}

}
