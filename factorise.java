/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) 
	{
	    int num=Integer.parseInt(args[0]);
	    for(int i=1;i<num;i++)
	    {
	        if(num%i==0)
	        {
	            System.out.print(i+" ");
	        }
	    }
		
}
	}
