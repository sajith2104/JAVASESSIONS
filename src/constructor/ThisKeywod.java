package constructor;

class Employee
{
	String name;
	int id;
	char gender;
	
	Employee(String name,int id,char gender)// constructor
	{
		this(); // Constructor calling must be the first statement  and it calling should be from another constructor
		
		this.name=name;
		this.id=id;
		this.gender=gender;
	}
	Employee(String name,char gender,int id)
	{
		this();
		this.name=name;
		this.id=id;
		this.gender=gender;
	}
	Employee()
	{
		System.out.println("Parameterless constructor");
		this.details();
		
	}
	void details()
	{
		
		System.out.println("Details method");
	}
}
public class ThisKeywod 
// this is a keyword used to refer the current object 
{

	public static void main(String[] args) 
	{
		Employee obj= new Employee("sajith",123,'M');
		System.out.println(obj.name);
		System.out.println(obj.id);
		System.out.println(obj.gender);
		
		Employee obj1=new Employee("afrin",'F',2);
		System.out.println(obj1.name);

	}
	

}
