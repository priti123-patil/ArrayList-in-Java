import java.util.*;
class arraylistex16
{
public static void main(String args[])
{
ArrayList<Integer> arr=new ArrayList<>();
arr.add(56);
arr.add(67);
arr.add(78);
arr.add(89);
List<Integer> arr2=arr.subList(1,3);
System.out.println("sublist of arraylist:" +arr2);
System.out.println("elements of arraylist:" +arr);
}
}

