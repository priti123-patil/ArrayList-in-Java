import java.io.*; 
import java.util.*;
class  arraylistex1{ 
public static void main(String[] args) 
{ 
// create an empty array list with an initial capacity
ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
// use add method to add elements
arrlist.add(10);
arrlist.add(50);
arrlist.add(30);
// this will increase the capacity of the ArrayList to 15 elements
arrlist.ensureCapacity(15);
// let us print all the elements available in list
for (Integer number : arrlist) {
System.out.println("Number = " + number);
}
}
}