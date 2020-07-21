import java.util.ArrayList; 
public class arraylistex15 { 
public static void main(String[] args) 
{ 
ArrayList<Integer> arr = new ArrayList<Integer>();
arr.add(100); 
arr.add(200); 
arr.add(300); 
arr.add(400); 
System.out.println("List before removing all element: " + arr);  
arr.clear();
System.out.println("list after removing all elements " + arr); 
} 
} 