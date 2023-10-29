package datatypes;

public class DataTypes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TWO TYPES OF DATA TYPES
		/*primitive data TYPE
		 * 2.NON-PRIMITIVE DATATYPES
		 */
		//1.PRIMITIVE DATA TYPES
		System.out.println("----this is boolean data type---");
		boolean b = true;
		System.out.println(b);
		boolean bf = false;
		System.out.println(bf);
		System.out.println("*******This is char data type");
        //a)character type:char
        //size:2bytes-->2*8=16bits
		char a='a';
		System.out.println(a);
		char c='8';
		System.out.println(c);
		char s='%';
		System.out.println(s);
System.out.println("*******This is byte data type");
        
        //1.byte
        //size--->1byte--->8bits
        //range--> -128 to 127
    byte by= 127;
    System.out.println(by);
    byte byt= -128;
    System.out.println(byt);
    System.out.println("*******This is short data type");
    
    //2.short:
    //size:2bytes--->2*8=16bits
    //range:-32768 to 32767 
    short sho= 32767;
    short sh= -32768;
    System.out.println(sho);
    System.out.println(sh);
    System.out.println("*******This is int data type");
    //3.int
    //size:4bytes--->4*8=32bits
    //range:-2147483648 to 2147483647 
    int i=1234;
    System.out.println(i);
    System.out.println("*******This is long data type");
	
	//3.long
	//size:8bytes--->8*8=64bits
	//range:-2^63 to 2^63-1
    
    long L;//variable declaration
    //syntax - datatype variablename
   L = 123456789123456L;//init
   
   //variable name = value;
   System.out.println(L);//variable utilization
   
   // long l=12345;
   System.out.println("*******This is float data type");
	//5.float
	//size 4bytes--4*8=32bits
	//range--3.4028235E38.-->7digits
	
	//1.one way of init
	float fl=3.14f;
	
	
	System.out.println(fl);
	//2.one way of init
	float ft=(float)13.00014;
	
	System.out.println(ft);
	
	
	float fff=3f;
	System.out.println(fff);
	System.out.println("*******This is Double data type");
	
	
	//6.double
	//size 8bytes-->8*8=64bits
	//range---->15digits
	
	double  d=30;
	System.out.println(d);
	double dd=1.00000000;
	System.out.println(dd);	
		
	}

}
