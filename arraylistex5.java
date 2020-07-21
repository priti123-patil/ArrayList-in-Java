import java.util.*;
class arraylistex5
{
public static void main(String args[])
{
ArrayList<Integer> arr2=new ArrayList<>(5);
arr2.add(10);
arr2.add(20);
arr2.add(30);
arr2.add(40);
boolean result=arr2.isEmpty();
if(result=false)
{
System.out.println("arraylist is empty");
}
else
{
System.out.println("arraylist is not empty");
System.out.println("elements in the arraylist are:" +arr2);
}
}
}
