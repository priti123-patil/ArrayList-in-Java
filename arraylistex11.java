import java.util.ArrayList; 
public class arraylistex11 { 
public static void main(String[] args) 
{ 
ArrayList<Integer> arr = new ArrayList<Integer>();
arr.add(10); 
arr.add(20); 
arr.add(30); 
arr.add(40); 
System.out.println("List before adding element: " + arr); 
// element at index 2 
arr.add(50);
System.out.println("list after adding element at the end  " + arr); 
} 
} 