// program to print average, minimum,maximum of an array

class average
{
 public static void main(String a[])
 {
  int len=a.length;
  int sum=0,max=0,min;
  min=Integer.parseInt(a[0]);
  for(i=0;i<len;i++)
{
  sum=sum+Integer.parseInt(a[i]);
  if(Integer.parseInt(a[i])>max)
     {
       max=Integer.parseInt(a[i]);
     }
if(Integer.parseInt(a[i])<min)
     {
      min=Integer.parseInt(a[i]);
     }
}
 
float avg=(float) sum/len;
System.out.println("average is:"+avg);
system.out.println("maximum is:"+max);
system.out.println("minimum is:"+min);
}
}

