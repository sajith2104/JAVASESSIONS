package demo;
interface flipkart
{
	String username="sajith";//by default variables are public ,static and final
void cart();//by default methods are public and abstract  
public abstract void wishlist();
}

class Shopping implements flipkart
{

	@Override
	public void cart()
	{
		// TODO Auto-generated method stub
	System.out.println("add to cart");	
	}

	@Override
	public void wishlist() {
		// TODO Auto-generated method stub
		Checkout();
		System.out.println("add to wishlist");
	}
	
	public static void Checkout() {
		System.out.println("Proceed to checkout ");
	}
	
}

public class Interface {
	

	public static void main(String[] args) 
	{
		//String username = "varu";
	 Shopping obj= new Shopping();
		obj.cart();
		obj.wishlist();
		obj.Checkout();
		// by using object reference we can access both static and non static members and methods
		
		System.out.println(obj.username);
		System.out.println(flipkart.username);
		
		

	}

}
