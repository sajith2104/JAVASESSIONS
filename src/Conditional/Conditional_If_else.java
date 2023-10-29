package Conditional;

import java.util.Scanner;

public class Conditional_If_else {

	public static void main(String[] args) {
		/* if else syntax
		 * 
		 * if(condition)
		 * {
		 *   statements;
		 *  }
		 *   else
		 *   {
		 *    statements;
		 *    }
		 *    
		 *   Else get executed when the if condition is false
		 * 
		 */
           int age;
           Scanner a=new Scanner(System.in);
           System.out.println("please enter your Age");
           age=a.nextInt();
           if(age>=18)
           {
        	  System.out.println("Great you are eligible for voting");
           }
           else
           {
        	   System.out.println("Sorry you are not eligible for voting");
           }
            
           String nationality="INDIA";
           if(nationality=="INDIA")
           {
        	   System.out.println("eligible");
           }
           else
           {
        	   System.out.println("Sorry only indians are eligible");
           }
        		   
	}

}
