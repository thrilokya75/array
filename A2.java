import java.lang.*;
class A2
{
public static void main(String args[])
{
int [] a=new int[] {2,6,1,8,95,9};
int max=0;
for(int i=0;i<a.length;i++)
{
if(max<a[i])
{
 max=a[i];
}
}
System.out.println(max);
int min=a[0];
for(int i=1;i<a.length;i++)
{
if(min>a[i])
 min=a[i];
}
System.out.println(min);
}
}