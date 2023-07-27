package SDR;

import java.util.Scanner;

public class swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value for x");
		System.out.println("Enter the value of y");
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Before Swap"+" x:"+x+" y:"+y);
		x=x-y;
		y=x+y;
		x=y-x;
		System.out.println("After Swap"+" x:"+x+" y:"+y);
		

	}

}
