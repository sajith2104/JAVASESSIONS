package Polymorphism;

public class Method_OverLoading {

	public static void main(String[] args) {
	
		Method_OverLoading obj=new Method_OverLoading();
		obj.loan("SBI");
		obj.loan("PERSONAL",1234234223);
		obj.loan(1234234223,"CAR LOAN");
		obj.loan("HDFC","SALARIED");
		obj.loan(5.6);
		obj.loan(500000,"EDUCATION",1.5);
		obj.loan(30000,4,"HOME LOAN");
	}
void loan(String bankname)
{
	System.out.println(bankname);
}


void loan(String loantype,int acno)
{
	System.out.println("loantype: "+loantype+ " account no: "+acno );
}
void loan(int acno,String loantype)
{
System.out.println("loantype: "+loantype);	
}
void loan(String bankname,String actype)
{
	System.out.println("Bank Name: "+bankname+" accounttype: "+actype);
}
void loan(double interest)
{
	System.out.println("Interest: "+interest );
}
void loan(int amount,String loantype,double interest)
{
	System.out.println("amount: "+amount+" loan type: "+loantype+ " interest: "+interest);
}
void loan(int amount, double interest,String loantype)
{
	System.out.println("amount: "+amount+" loan type: "+loantype+ " interest: "+interest);
}
	

}
