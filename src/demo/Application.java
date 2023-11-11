package demo;

public interface Application 
{
abstract void login();
abstract void home();
}
class Application2 implements Application
{

	
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login");
	}

	@Override
	public void home() {
		// TODO Auto-generated method stub
		System.out.println("home method");
	}
	
	
	
	
}
