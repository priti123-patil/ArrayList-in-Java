import java.util.*;
class arraylistex6
{
public static void main(String args[])
{
ArrayList<Integer> arr2=new ArrayList<>(5);
arr2.add(10);
arr2.add(20);
arr2.add(30);
arr2.add(40);
System.out.println("enter the element to search");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(arr2.contains(a))
{
System.out.println("arraylist contains " +a);
}
else
{
System.out.println("arraylist does not contain " +a);
}
}
}