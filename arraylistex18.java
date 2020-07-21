import java.util.*;
class arraylistex18
{
public static void main(String args[])
{
ArrayList<Integer> arr=new ArrayList<>();
arr.add(15);
arr.add(25);
arr.add(85);
arr.add(95);
arr.add(105);
System.out.println("Elements of first arraylist:" +arr);
ArrayList<Integer> arr2=new ArrayList<>();
arr2.add(35);
arr2.add(45);
arr2.add(55);
arr2.add(65);
arr2.add(75);
System.out.println("Elements of second arraylist:" +arr2);
arr.addAll(2,arr2);
System.out.println("list1 + List2= " +arr);
}
}
