package arrays;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Syntax1: datatype variablename [][]={{1,2},{2,4},{3,7}};
		 * Syntax2: datatype variablename[][]=new datatype[rowsize][columnsize];
		 * rowsize is mandatory,columnsize is optional
		 *  datatype variablename[][]=new datatype[][]{{1,4,5},{3,4,6}}
		*/
		
		//Syntax1
		int array1[][]= {{1,2},{3,4},{5,6}};
		for(int row=0;row<array1.length;row++)
		{
			for(int column=0;column<array1[row].length;column++)
			{
				System.out.println(array1[row][column]);
			}
		}
		
		//Syntax2 
		System.out.println("Syntax2 using for each");
		int array2[][]=new int[3][3];
		array2[0][0]=6;
		array2[0][1]=4;
		array2[0][2]=8;
		array2[1][0]=9;
		array2[1][1]=0;
		array2[1][2]=2;
		array2[2][0]=1;
		array2[2][1]=89;
		array2[2][2]=98;
		for(int[] row:array2)
		{
			for(int column:row)
			{
				System.out.println(column);
			}
		}
		
		
		
		

	}

}
