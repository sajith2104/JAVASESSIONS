package Conditional;

public class Nestesd_if {

	public static void main(String[] args) {
		/*
		 * SYNTAX
		 *  if(condition)
		 *  {
		 *  if(condition)
		 *  {
		 *  statement;
		 *  }
		 *  else
		 *  {
		 *  statement;
		 *  }
		 *  if(condition)
		 *  {
		 *  statement;
		 *  }
		 *  else
		 *  {
		 *  statement;
		 *  }
		 *  else
		 *  {
		 *  statement
		 *  }
		 *  }
		 *  
		 *  
		 */
		
		String customer ="Regular";
		int total_cost = 500;
		double discount = 0.0;
		double final_price=total_cost;
	
		if(customer=="Regular")
		{
			System.out.println("buy for  1000 to get 10% discount ");
			System.out.println("buy for  2000 to get 20% discount ");
			if(total_cost>=1000 && total_cost<2000)
			{
				System.out.println("congatulation you got 10% discount");
				discount=10;
				final_price=total_cost-(total_cost*discount/100);
				System.out.println(final_price);
				
			}
			else if(total_cost>=2000)
			{
				System.out.println("congratulation you got 20% discount");
				
				discount=20;
				final_price=total_cost-(total_cost*discount/100);
				System.out.println("FINAL PRICE" +final_price);
			}
			else
			{
				System.out.println("please purchasae for minimum 1000 rupees to get extra discount");
				System.out.println("FINAL PRICE " +final_price);
			}
		}
		else
		{
			System.out.println("thanks for Shopping get membership to get extra discounr");
			System.out.println(final_price);
		}
		

	}

	
}
