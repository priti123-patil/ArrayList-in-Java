import java.util.*; 
public class arraylistex8 { 
public static void main(String[] args) 
{ 
        ArrayList<Integer> ArrLis = new ArrayList<Integer>(); 
  
        
        ArrLis.add(15); 
        ArrLis.add(25); 
        ArrLis.add(35); 
        ArrLis.add(45); 
        System.out.println("ArrayList: " + ArrLis); 
  
        // Get the array of the elements 
        // of the ArrayList 
        // using toArray() method 
        Object[] arr = ArrLis.toArray(); 
  
        System.out.println("Elements of ArrayList "+ " as Array: "+ Arrays.toString(arr)); 
    } 
} 