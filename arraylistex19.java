import java.util.*;
class arraylistex19
{
public static void main(String args[])
{
ArrayList<String> arr=new ArrayList<>();
arr.add("collection framework in java:");
arr.add(1,"Arraylist");
System.out.println("Elements of first list: " +arr);
System.out.println();
ArrayList<String> arr2=new ArrayList<>();
arr2.add("Vector");
arr2.add("List");
arr2.add("Linked List");
arr2.add("Vector");
System.out.println("Elements of second list: " +arr2);
System.out.println();
arr.addAll(2,arr2);
System.out.println("list1 + list2 " +arr);
System.out.println();
ArrayList<String> arr3=new ArrayList<>();
arr3.add("Stack");
arr3.add("Hashset");
System.out.println("Elements of third list: " +arr3);
System.out.println();
arr.addAll(arr3);
System.out.println("list1 + list3 = " +arr);
System.out.println();
boolean flag =  arr.contains("List");
        if (flag == true) {
            System.out.println("a list contains element list");
System.out.println();
        }else{
            System.out.println("a List doesn't contains element list");
System.out.println();
        }
String value = arr.get(2);
System.out.println("Element Retrieved at index 2 i.e. 3rd position = " + value);
System.out.println();
int value2 = arr.indexOf("Linked List");
System.out.println("Index Retrived of Linked List = " + value2);
System.out.println();
arr.ensureCapacity(20);
System.out.println("Array List Number = " +arr);
System.out.println();
int index1 = arr.lastIndexOf("Vector");
System.out.println("index of Last Vector in ArrayList: " + index1);
System.out.println();
arr.set(2,"stack");
System.out.println("The ArrayList after setting 333 value at index 2:" +arr);
System.out.println();
arr.remove(2);
System.out.println("ArrayList After Removing Element at index 2= " +arr);
System.out.println();
System.out.println("Size of Arraylist is :" + arr.size());
System.out.println();
Object[] object = arr.toArray();
for(int i=0;i<object.length;i++){
System.out.println("Value at index "+i+" of Array coverted from ArrayList= "+object[i]);
System.out.println();
}
arr.trimToSize();
System.out.println("Printing an ArrayList after using trimToSize method "+arr);
System.out.println();
boolean flag1 = arr.isEmpty();

        if(flag1==true){
            System.out.println("ArrayList is Empty");
        }

        else{
            System.out.println("ArrayList is not Empty");
        }
        System.out.println();
arr.clear();
System.out.println("empty arraylist after using clear method: " +arr);
}
}