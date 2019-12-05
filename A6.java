import java.lang.*;
class A6
{
public static void main(String args[])
{
int [] n=new int[]{2,1,7,5,4};
for(int i=0;i<n.length;i++)
{ 
for(int j=i+1;j<n.length;j++)
{ 
if(n[i]>n[j])
{
 int temp;
 temp=n[i];
 n[i]=n[j];
 n[j]=temp;
}
}
}
for(int i=0;i<n.length;i++)
{ 
 System.out.println("sorted array is:"+n[i]);
}
}
}