package Conditional;

public class Conditional_if_elseif {

	public static void main(String[] args) {
		/*if-else-if : 
		 * whenever we have a multiple conditions to check in the program  we have to go for"else if".
		 * 
		 * 
		 * syntax:
		 * 
		 * if(condition 1)
		 * {
		 * statement;
		 * }
		 * else if(condition 2)
		 * {
		 * statement;
		 * }
		 * else if(condition 3)
		 * {
		 * statement;
		 * }
		 * else
		 * {
		 * statement;
		 * }
		 * 
		 * 
		 * NOTE:
		 * 
		 * ->If first condition is true then second, third and else block they will not get a chance to execute.
		 * ->when condition 1 is false then condition 2 gets a chance to execute.
		 * ->when condition 2 is also false then condition 3 gets a chance to execute.
		 * ->when all the conditions are false then the else block will execute.
		 *
		 * 
		 */
		        int  marks=90;
		        System.out.println("The grade is");
		        if(marks>=90)
		        {
		        	System.out.println("A");
		        }
		        else if(marks<90&&marks>=80)
		        {
		        	System.out.println("B");
		        }
		        else if(marks<80&&marks>=70)
		        {
		        System.out.println("D");
		        }
		        else
		        {
		          System.out.println("E");
		        }
		   
		       
		        	
		        
		        
		        
			}
		


	}


