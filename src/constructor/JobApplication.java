package constructor;

 class Nucot
 {
	 String name;
	 String qualification;
	 int passyear;
	 double percentage;
	 String courseenrolled;
	 long contact;
	 String mailid;
	public Nucot(String name, String qualification, int passyear, double percentage, String courseenrolled,
			long contact, String mailid) {
		//super();
		this.name = name;
		this.qualification = qualification;
		this.passyear = passyear;
		this.percentage = percentage;
		this.courseenrolled = courseenrolled;
		this.contact = contact;
		this.mailid = mailid;
	
	}
	
	public void details()
	{
		System.out.println("NAME : " + name);
		System.out.println("QUALIFICATION : " + qualification);
		System.out.println("PASSED OUT : " + passyear);
		System.out.println("PERCENTAGE : " + percentage);
		System.out.println("COURSE ENROLLED : " + courseenrolled);
		System.out.println("CONTACT : " + contact);
		System.out.println("EMAIL : " + mailid);
		
	}
	 
	 
 }

public class JobApplication {

	public static void main(String[] args)
	{
	Nucot registration1=new Nucot("SAJITH","Btech",2021,65.00,"SDET",8297763140l,"sajithshaik5@gmail.com");
	Nucot registration2=new Nucot("MAGGIE","Btech",2021,70.00,"SDET",8765987543l,"meghanachinni@gmail.com");
	Nucot registration3=new Nucot("SNEHA","Btech",2021,80.00,"SDET",9964789543l,"thanusneha@gmail.com");
	Nucot registration4=new Nucot("SUPRIYA","MBA",2021,69.00,"SDET",7730123098l,"supriyaraut@gmail.com");
	Nucot registration5=new Nucot("ASHWINI","MCA",2021,78.00,"SDET",6542190870l,"ashwini@gmail.com");
    
     registration1.details();
     System.out.println("---------------------------------");
     registration2.details();
     System.out.println("---------------------------------");
     registration3.details();
     System.out.println("---------------------------------");
     registration4.details();
     System.out.println("---------------------------------");
     registration5.details();
     System.out.println("---------------------------------");
	}

}
