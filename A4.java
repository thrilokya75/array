import java.lang.*;
class A4
{
public static void main(String args[])
{
int num[]=new int[] {97,100,105,110};
String st=null;
for(int i=0;i<num.length;i++)
{
st=Character.toString((char)num[i]);
System.out.println(st);
}
}
}