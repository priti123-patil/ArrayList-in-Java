import java.util.*;
class arraylistex17
{
public static void main(String args[])
{
ArrayList<Integer> arr=new ArrayList<>();
arr.add(2);
arr.add(4);
arr.add(6);
arr.add(8);
arr.add(10);
System.out.println("Elements of first arraylist:" +arr);
ArrayList<Integer> arr2=new ArrayList<>();
arr2.add(12);
arr2.add(14);
arr2.add(16);
arr2.add(18);
arr2.add(20);
System.out.println("Elements of second arraylist:" +arr2);
arr.addAll(arr2);
System.out.println("list1 + List2= " +arr);
}
}
