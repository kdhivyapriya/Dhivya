/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import static java.lang.Math.*;
public class Main
{
	public static void main(String[] args) {
		int r=Integer.parseInt(args[0]);
		float pi=3.14f;
		float cir_area=(float)(pi*r*r);
		float cir_cum=(float)(2*pi*r);
		System.out.println("***************CIRCLE***************");
		System.out.println("AREA:"+cir_area);
		System.out.println("CIRCUMFERENCE:"+cir_cum);
		float sq_area=(float)(r*r);
		float sq_peri=(float)(4*r);
		float sq_dia=(float)Math.sqrt((r*r)+(r*r));
		System.out.println("***************SQUARE****************");
		System.out.println("AREA:"+sq_area);
		System.out.println("PERIMETER:"+sq_peri);
		System.out.println("LENGTH OF THE DIAGONAL:"+sq_dia);
	}
}


//int[][] arr=new int[10][10];
//for (; ; )
//for
//arr[i][j]=0;
//arr[r][c]=val;