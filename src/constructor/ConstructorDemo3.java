package constructor;

class Student
{
	 String name;
	 int  id;
	Student(String a, int b)//parameterized constructor
	{
		name=a;
		id=b;
	}
}

public class ConstructorDemo3 {

	public static void main(String[] args)
	{
		System.out.println("first student details");
		Student obj= new Student("sajith",1);
		System.out.println(obj.name);
		System.out.println(obj.id);
		System.out.println("second student details");
		Student obj1=new Student("Afrin",2);
		System.out.println(obj1.name);
		System.out.println(obj1.id);
				
		

	}

}
