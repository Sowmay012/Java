package SDR;

public class wrapper3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		
		System.out.println("---Printing object values----");
		System.out.println("Byte Object:"+byteobj);
		System.out.println("Short object:"+shortobj);
		System.out.println("Integer object:"+intobj);
		System.out.println("Long object:"+longobj);
		System.out.println("Float object:"+floatobj);
	    System.out.println("Double object:"+doubleobj);
	    System.out.println("Boolean Object:"+boolobj);
	    
	    byte bytevalue=byteobj;
	    short shortvalue=shortobj;
	    int intvalue=intobj;
	    long longvalue=longobj;
	    float floatvalue=floatobj;
	    double doublevalue=doubleobj;
	    char charvalue=charobj;
	    boolean boolvalue=boolobj;
	    
	    System.out.println("---Printing Primitive values----");
		System.out.println("byte Object:"+bytevalue);
		System.out.println("short object:"+shortvalue);
		System.out.println("integer object:"+intvalue);
		System.out.println("long object:"+longvalue);
		System.out.println("float object:"+floatvalue);
	    System.out.println("double object:"+doublevalue);
	    System.out.println("boolean Object:"+boolvalue);
	    
	        
	}
}
