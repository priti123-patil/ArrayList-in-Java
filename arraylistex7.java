import java.util.*;
class arraylistex7
{
public static void main(String args[])
{
ArrayList<Integer> arr2=new ArrayList<>(5);
arr2.add(10);
arr2.add(20);
arr2.add(30);
arr2.add(40);
System.out.println("enter the element to find index of it");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=arr2.indexOf(a);

System.out.println("index of " +a+ " is " +b);

}
}