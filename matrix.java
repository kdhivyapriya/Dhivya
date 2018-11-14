/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int[][] arr=new int[10][10];
		for(int i=0;i<10;i++){
		    for(int j=0;j<10;j++){
		        arr[i][j]=0;
		    }
		}
		int val,r,c;
		val=Integer.parseInt(args[0]);
		r=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		arr[r][c]=val;
		System.out.println("*********ORIGINAL MATRIX***********");
		for(int i=0;i<10;i++){
		    for(int j=0;j<10;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
		System.out.println("*********TRANSPOSED MATRIX***********");
		for(int i=0;i<10;i++){
		    for(int j=0;j<10;j++){
		        System.out.print(arr[j][i]+" ");
		    }
		    System.out.println();
		}
	}
}
