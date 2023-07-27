package SDR;

public class nested {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String city="Delhi,India";
		
		if(city.endsWith("India"))
		{
		if(city.contains("noida"))
				{
			System.out.println("Noida");
				}
		else if(city.contains("merrut"))
				{
			System.out.println("merrut");
				}
		else
		{
			System.out.println(city.split(",")[0]);
		}
		}
		else
		{
			System.out.println("It is not a city in India");
		}
	}

}
