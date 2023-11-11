package constructor;// Constructor is a special method which doesnt have any return type and used to initialize instance variables
                    // instance variables - declare inside the class and outside the method
                    // constructor name must be same as class name

 class InstanceVariable
 
{
	 /*1.if the class doesnt contain any constructor then the compiler will automatically create a parameter less constructor.
	  *2.Inside the constructor compiler will intialize the instance variables with their default values.
	  *3. Default values for instance variables.
	  *
	  * For byte,short,int,long = 0
	  * 
	  * For Float and double = 0.0
	  * 
	  * For String = null
	  * 
	  * For boolean = false
	  *  
	  *  For char = empty space
	  */
	 
	 
	 
	int variable; 
	short s;
	byte b;
	long l;
	float f;
	double d;
    char c;
	
    String name;
	boolean a;

	
}
                      
                      
public class ConstuctorDemo {

	public static void main(String[] args) 
	{
	
		InstanceVariable obj= new InstanceVariable();// parameter less constructor will call automatically while object creation
		System.out.println(obj.variable);
        System.out.println(obj.name);
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.s);
        System.out.println(obj.l);
        System.out.println(obj.f);
        System.out.println(obj.d);
        System.out.println(obj.c);
        
      
	}

}
