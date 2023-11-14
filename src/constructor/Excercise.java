package constructor;

class Customer
{
	String customerName;
	long contactNumber;
	String address;
	String customerId;
	Customer(String customerName, long contactNumber, String address)
	{
		this.customerName=customerName;
		this.contactNumber=contactNumber;
		this.address=address;
		
	}
	void display()
	{
		System.out.println("customername :"+customerName);
		System.out.println("contact  : "+contactNumber);
		System.out.println("customer address :"+address);
		System.out.println("customer ID : "+ customerId);

		

	}
}
public class Excercise {

	public static void main(String[] args) 
	{
		Customer customer1=new Customer("sajith",8297763140l,"andhra");
	    Customer customer2=new Customer("Suprithi",8769509876l,"kerala");
	    Customer  customer3=new Customer("varalakshmi",9867504869l,"china");
		customer1.display();
		System.out.println("_____________________________________________________");
		customer2.display();
		System.out.println("_____________________________________________________");
		customer3.display();
		System.out.println("_____________________________________________________");
		

	}

}
