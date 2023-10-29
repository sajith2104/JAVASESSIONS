package Conditional;

public class Conditional_Switch {

	public static void main(String[] args) {
		// Switch statement
		/*syntax
		 * 
		 * switch(variable)
		 * {
		 * case 1:
		 *statement;
		 * break;
		 * 
		 * case 2:
		 * statement;
		 * break;
		 * 
		 * case 3:
		 * statement;
		 * break;
		 * }
		 * 
		 * -> Switch is used when we have multiple conditions to check.
		 * -> Switch can have multiple cases
		 * -> Switch will not take condition it will take an option
		 * -> Every case should have a break statement
		 * -> Break statement will helps to stop the execution and it will come out of the particular block or loop
		 * 
		 *  default:
		 *  
		 *  ->Switch can also have default
		 *  ->default will act like else
		 *  -> If none of the cases are matching then default will get executed.
		 *  
		 */
		
              // program to find vowels and consonents
		char c= 'b';
		System.out.println("the given character is");
		switch(c)
		{
		case 'a': 
			System.out.println(c +"  is vowel");
			break;
		case 'e':
			System.out.println(c +"  is vowel");
			break;
		case 'i':
			System.out.println(c +"  is vowel");
			break;
		case 'o':
			System.out.println(c +"  is vowel");
			break;
		case 'u':
			System.out.println(c +"  is vowel");
			break;
		default:
				System.out.println(c +" is consonant");
		}
		
		
	}

}
