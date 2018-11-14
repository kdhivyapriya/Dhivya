/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int rem=0,rev_num=0,ori_num;
		ori_num=num;
		while(num!=0)
		{
		    rem=num%10;
		    rev_num=rev_num*10+rem;
		    num=num/10;
		}
		if(ori_num==rev_num)
		{
		    System.out.println("INPUT NUMBER "+ori_num+" IS A PALINDROME");
		}
		else
		System.out.println("INPUT NUMBER "+ori_num+" IS NOT A PALINDROME");
	}
}
