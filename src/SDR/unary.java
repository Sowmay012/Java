package SDR;

public class unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int a=20;
		int b=30;
		int c=1;
		int d=-1;
		Boolean y=true;
		Boolean z=false;
		
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
		
		System.out.println(a++ + ++a);
		System.out.println(b-- - --b);

		System.out.println(~c);
		System.out.println(~d);
		
		System.out.println(!y);
		System.out.println(!z);


	}

}
