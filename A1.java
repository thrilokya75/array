import java.lang.*;
class A1
{
public static void main(String args[])
{
int [] a=new int[] {1,2,3,4,5,6};
int sum=0;
for(int i=0;i<6;i++)
{
 sum=sum+a[i];
}
int avg=sum/6;
System.out.println(avg);
}
} 