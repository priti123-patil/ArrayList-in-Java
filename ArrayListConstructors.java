import java.io.*; 
import java.util.*; 
class ArrayListConstructors { 
public static void main(String args[]) 
{ 
ArrayList<Integer> array1= new ArrayList<Integer>(3); //creating arraylist using ararylist class
List<String> array2=new ArrayList<>(4);//creating arraylist using list interface
array1.add(1);
array1.add(2);
array1.add(3);
array2.add("Java");
array2.add("Programming");
System.out.println("Elements of first arrayList:" +array1);
System.out.println("Elements of second arrayList:" +array2);
}
}

  