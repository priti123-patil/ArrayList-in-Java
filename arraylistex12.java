import java.util.ArrayList; 
public class arraylistex12 { 
public static void main(String[] args) 
{ 
ArrayList<Integer> arr = new ArrayList<Integer>();
arr.add(10); 
arr.add(20); 
arr.add(30); 
arr.add(40); 
System.out.println("List before adding element: " + arr);  
arr.add(2,35);
System.out.println("list after adding element at third position  " + arr); 
} 
} 