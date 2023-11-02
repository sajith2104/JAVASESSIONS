package Polymorphism;

public class MethodOverLoading2 {

   String booking(String bookingtype)
   {
	return "your booking type" +bookingtype; 
	
	// return type Should be the last statement in a merthod
	//System.out.println("method overloading using String return type");
	//or return bookingtype;

   }
   int booking(int ticketPrice)
   {
	   System.out.println("Booking based on ticket price");
	   return ticketPrice;
   }
   char booking(char gender)
   {
	   System.out.println("booking based on gender");
	   return gender;
	   
   }
   boolean booking(boolean travelinsurance)
   {
	   return true;
   }
   float booking(int discount,String coupon)
   {
	   System.out.println("method with different datatypes and float return type");
	   return discount;
	   
   }
    int  booking()
    {
    	
    	System.out.println("method with no arguments and no return type");
    	
    	return 10;
    }
    
   public static void main(String []args) 
   {
	   MethodOverLoading2 obj = new MethodOverLoading2();
	   obj.booking(false);
	   obj.booking("bus");
	   obj.booking(500);
	   obj.booking('m');
	   obj.booking(10,"10% discount");
	   obj.booking();
	   
	  
	   
   }
}
