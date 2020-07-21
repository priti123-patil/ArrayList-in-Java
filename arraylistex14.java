import java.util.ArrayList; 
public class arraylistex14 { 
public static void main(String[] args) 
{ 
ArrayList<String> arr = new ArrayList<>();
arr.add("c"); 
arr.add("c++"); 
arr.add("java"); 
arr.add("ada"); 
System.out.println("List before removing element: " + arr);  
arr.remove("c");
System.out.println("list after removing element" + arr); 
} 
} 