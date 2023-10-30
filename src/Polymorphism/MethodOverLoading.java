package Polymorphism;

public class MethodOverLoading {

	public static void main(String[] args) 
	{
		 MethodOverLoading obj= new  MethodOverLoading();
		 obj.add(1, 2);
		 obj.add(1, 2,3);
		 obj.add(1, 2,3,4,5);
		 obj.add(1, 2,3,4);
		 
	}
		/*
		 * POLYMORPHISM 
		 * 
		 *  1. It is one of the OOP'S concept
		 *  2. A single Action/Task can be performed in diferent ways is called polymorphism
		 *  
		 *  TYPES OF POLYMORPHISM
		 *  
		 *  1. Compile time polymorphism(Static polymorphism)
		 *  2. Run time polymorphism (Dynamic polymorphism)
		 *  
		 *  1. Compile Time Polymorphism
		 *  
		 *  -> A method which gets bounded or linked during compilation by the compiler is called as compile time polymorphism.
		 *  -> It is also called as Static binding or early binding
		 *  -> compile time polymorphism can be achieved by " METHOD OVERLOADING"
		 *  
		 *  METHOD OVERLOADING
		 *  
		 *  -> Developing multiple methods with same name but different argument list is known as method overloading
		 *  
		 *  Rules for method overloading
		 *  
		 *  1) we need to develop multiple methods inside the class.
		 *  2) no.of Arguments should differ
		 *  3) Type of Arguments should differ
		 *  4)Position of Arguments Should differ
		 *  
		 *  
		 *  
		 */
		// Example Program for method overloading
		 void add(int a, int b)
		 {
		
           System.out.println("Addition of two numers");
           int sum = a+b;
           System.out.println(sum);
           
	}
		 void add(int b,int a,int c)
		 
		 {
			 System.out.println("Addition of three numers");
	           int sum = a+b+c;
	           System.out.println(sum);
	}
		 void add(int a,int b, int c, int d)
		 {
			 System.out.println("Addition of four numers");
	           int sum = a+b+c+d;
	           System.out.println(sum);
	}
		 void add(int a,int b, int c, int d,int e)
		 {
			 System.out.println("Addition of five numers");
	           int sum = a+b+c+d+e;
	           System.out.println(sum);
	}
		/* void add(int a, int b, int c, int d, int e, int f)
		 {
			 System.out.println("Addition of two numers");
	           int sum = a+b;
	           System.out.println(sum);
	}*/

}



