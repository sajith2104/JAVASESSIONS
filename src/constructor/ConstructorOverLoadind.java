package constructor;


class Overloading
{
	long l;
	double d;
	Overloading()
	{
		System.out.println("parameterless constructor");
	}
	Overloading(String s)
	{
		System.out.println("one parameter constructor");
	}
	Overloading(long number, double id)
	{
		l=number;
		d=id;
	}
}
public class ConstructorOverLoadind {

	public static void main(String[] args) 
	{
		Overloading obj=new Overloading();
		System.out.println(obj.l);
		System.out.println(obj.d);
		
		Overloading obj1=new Overloading("sajith");
		System.out.println(obj1.l);
		Overloading obj2=new Overloading(82977,123);
		System.out.println(obj2.l);
		System.out.println(obj2.d);
		
		

	}

}
