public class Main

{
	
public static void main(String[] args) 
	
{
	    
int num1=Integer.parseInt(args[0]);
	    
int num2=Integer.parseInt(args[1]);
	    
String opr=args[2];
	    
int answer;
	    
switch(opr)
	    
{
	        
case "add":
	             
answer=num1+num2;
	            
 System.out.println("addtion:"+answer);
	           
  break;
	        
case "sub":
	           
answer=num1-num2;
	            
System.out.println("subraction:"+answer);
	           
 break;
	        
case "mul":
	            
answer=num1*num2;
	            
System.out.println("multiplication:"+answer);
	            
break;
	        
case "div":
	            
answer=num1/num2;
	            
System.out.println("division:"+answer);
	           
 break;
	        
case "mod":
	            
answer=num1%num2;
	            
System.out.println("modulo:"+answer);
	            
break;
	         
default:
	          
System.out.println("enter valid operator");
	        	            
 }
	        	             
	       
	    
		

}
	
}
