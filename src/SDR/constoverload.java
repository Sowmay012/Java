
package SDR;

public class constoverload {
	int id;
	String name;
	int age;
	constoverload(int i,String n){
		id=i;
		name=n;
	}
	constoverload(int id1,String name1,int age1)
	{
		id=id1;
		name=name1;
		age=age1;
	}
	void display()
	{
		
	System.out.println(id+":"+name+":"+age);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		constoverload d1=new constoverload(10,"savi",30);
		constoverload d2=new constoverload(20,"ruchi",35);
		d1.display();
		d2.display();
		

	}

}
