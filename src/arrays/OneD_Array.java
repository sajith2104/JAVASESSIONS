package arrays;

import java.util.Arrays;

public class OneD_Array {

	public static void main(String[] args) {
		/*Syntax1 : datatype variablename[]={value1,value2,value3,.....}
		 * Syntax2: datatype variablename[]=new datatype[size]; 
		 *          (OR) datatype variablename[]=new datatype[] {value1,value2,value3,.....}
       */
		int array[]= {1,2,3,4,5,6};
		System.out.println(array);
		 System.out.println(Arrays.toString(array));
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		//Syntax2
		int array1[]=new int[5];
		array1[0]=9;
		array1[1]=2;
		array1[2]=6;
		array1[3]=5;
		array1[4]=8;
		
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
		System.out.println("Third Element :"+array1[2]);
		
		//largest  element in Array
		
		
		int max=0;
		for(int i=0; i<array1.length; i++)
		{
		if(max<=array1[i])
		{
		max=array1[i];
		}
		}
		System.out.println("Largest element in the array is----->"+max);
		
		// Smallest element in array
		 
		int min=array1[0];
		for(int i=0; i<array1.length; i++)
		{
		if(min>=array1[i])
		{
		min=array1[i];
		}
		}
		System.out.println("Smallest element in the array is :---->"+min);
	}

}
