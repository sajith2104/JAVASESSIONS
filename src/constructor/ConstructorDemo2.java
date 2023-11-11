package constructor;

class Demo
{
	int a;
	float b;
	Demo()//constructor
	{
		System.out.println("user defined constructor");
	}
}

public class ConstructorDemo2 {

	public static void main(String[] args) {
		Demo obj = new Demo();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		
		
		

	}

}
