import java.lang.*;
class A8
{
public static void main(String args[])
{
int [] n=new int[]{10,20,10,30,40,100,99};
int count=0;
for(int i=0;i<n.length;i++)
{ 
for(int j=i+1;j<n.length;j++)
{ 
if(n[i]==n[j])
{
 count++;
}
}
}
System.out.println(count);
}
} 