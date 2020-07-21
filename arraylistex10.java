import java.util.ArrayList; 
public class arraylistex10 { 
public static void main(String[] args) 
{ 
ArrayList<Integer> arr = new ArrayList<Integer>();
arr.add(10); 
arr.add(20); 
arr.add(30); 
arr.add(40); 
System.out.println("List before adding element: " + arr); 
// element at index 2 
int element = arr.set(3,25); 
System.out.println("list after adding element " + arr); 
} 
} 