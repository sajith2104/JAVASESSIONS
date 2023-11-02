package Polymorphism;

public class StaticOverLoading {

	public static int main()
	{
		System.out.println("Main method with no arguments");
		return 10;
	}
	 static void main(int a)
	{
		System.out.println("Main method with one argument");
	}
	public static String main(int name,String name2)
	{
		System.out.println("Main method with two arguments");
		return name2;
	}
	public static void main(String a,int b)
	{
		System.out.println("Main method with two arguments but different order");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st way to call static methods 
		//using method name
		
		main();
		main(3);
		
		//2nd way to call static methods
		//using classname.methodname
		
		StaticOverLoading.main(25,"Java");
		StaticOverLoading.main("Sajith",22);
		
		
		
		

	}

}
