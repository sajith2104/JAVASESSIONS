package Interface;// Interface is used to achieve 100% abstraction and to achieve multiple inheritance

interface HotStar{
	
	void redeemPoints();
	
	void purchase();
}
class MobileSubscription{
	
	public void Watch() 
	{
	System.out.println("****MOBILE SUBSCRIPTION******");	
	System.out.println(" Only accessible to one device");
	}
	
	public void Usage() {
		System.out.println("****MOBILE SUBSCRIPTION******");
		System.out.println("we can only use on mobile");
	}
	public int Quality() {
		System.out.println("****MOBILE SUBSCRIPTION******");
		System.out.println("Picture Quality upto 720px");
		return 720;
	}
}
public class GoldSubscription extends MobileSubscription  implements HotStar
{

	@Override
	public void redeemPoints() {
		// TODO Auto-generated method stub
		System.out.println("reedem points to get the subscription");
		
	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		System.out.println("purchase subscription");
	}
	public  static void addsFree()
	{
		System.out.println("****GOLD SUBSCRIPTION******");
		
		System.out.println("Adds free streaming");
	}
	public static void fullHd()
	{
		System.out.println("****GOLD SUBSCRIPTION******");
		System.out.println("stream videos in full hd");
	}
	public  static void dolbyAtoms()
	{
		System.out.println("****GOLD SUBSCRIPTION******");
		System.out.println("experience dolby 5.1 dolby atmos sound");
	}
	public static void main(String[] args)
	{
		GoldSubscription g= new GoldSubscription();
		g.redeemPoints();
		g.Quality();
		g.purchase();
		g.Watch();
		g.Usage();
		dolbyAtoms();//calling static methods using method name
		GoldSubscription.addsFree();// calling static methods using "classname.methodname"
		fullHd();
	}

}



