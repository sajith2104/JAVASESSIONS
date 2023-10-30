package ItterationStatements;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int number=0;
		while(number<=100)
		{
			if(number%2!=0)
			{
				System.out.println(number);
			}
			number++;
			
		}
		
		System.out.println("***** program to find prime numbers**********");
		
		 int numb=11;
		 int count=0;
		 int num=1;
		 while(num<=numb)
		 {
		 if(numb%num==0)
		 {
			 count++;
		 }
           num++;
	}
		 if(count==2)
		 {
System.out.println("the given number is prime");
}
		 else {
			 System.out.println("the number is composite number");
		 }
		 
		 // program to print tables
		 System.out.println("************************************************");
		 System.out.println("tables");
			
			int n=12;
			int iiii=1;
			
			while(iiii<=10)
			{
				System.out.printf("%d * %d = %d \n",n,iiii,n*iiii);
				iiii++;
			}
			
}
}