import java.util.*;
class arraylistex2
{
public static void main(String args[])
{
ArrayList<Integer> arr2=new ArrayList<>(5);
arr2.add(10);
arr2.add(20);
arr2.add(30);
arr2.add(40);
arr2.trimToSize();//trim the arraylist
System.out.println("Elements in given arraylist:" +arr2);
}
}