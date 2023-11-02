package Polymorphism;

public class MethodOverLoading1 {

	
		// TODO Auto-generated method stub
		String searchProduct(String name)
		{
			
			String name1=name;
			System.out.println("Searching the product based on the name");
			return  name;
		}
		
		void searchProduct(String name ,int price)
		{
			
			
			System.out.println("Searching the product based on the name and price");
		}
		
		void searchProduct()
		{
			System.out.println("Searching the product based on the price rating and brand");
		}
		
		void searchProduct(String name,int price,int discout )
		{
			System.out.println("Searching the product based on the name price and discout");
		}
		
		public static void main(String[] args) {
			
			MethodOverLoading1 obj=new MethodOverLoading1();
			obj.searchProduct("Mobile phone");		
			obj.searchProduct("Mobile phone",10000);
			obj.searchProduct();
			obj.searchProduct("Mobile phone",10000,60);

	}

}
