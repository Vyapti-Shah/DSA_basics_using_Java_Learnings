import java.util.ArrayList;

public class DynamicArrayMain {
    public static void main(String[] args) {
        //Static Array = Array with fixed capacity 
        //Dynamic Array = Array which increases its capacity when the static array gets full 
        //The times at which the capacity increases depends on the programming language //For Java ArrayList-increases by 1.5-2 times(capacity*2)

        //Advantages = Random access of elements 0(1)
        //           = Good locality of reference and data cache utilization
        //           = Easy to insert/delete at the end

        //Disadvantages = Wastes more memory
        //              = Shifting elements is time consuming 0(n)
        //              = Expanding/Shrinking of array is time consuming 0(n)
        
        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        System.out.println(dynamicArray);
        dynamicArray.insert(0, "X");
        System.out.println(dynamicArray);
        dynamicArray.delete("A");
        System.out.println(dynamicArray);
        System.out.println("Size: " +dynamicArray.size);
        System.out.println("Capacity: " +dynamicArray.capacity);
        System.out.println("Empty: "+dynamicArray.isEmpty());
        System.out.println(dynamicArray.search("C"));
        dynamicArray.add("D");
        dynamicArray.add("E");
        System.out.println(dynamicArray);
        dynamicArray.add("F");
        System.out.println(dynamicArray);
        System.out.println("Size: " +dynamicArray.size);
        System.out.println("Capacity: " +dynamicArray.capacity);

        dynamicArray.delete("F");
        dynamicArray.delete("E");
        dynamicArray.delete("D");
        System.out.println(dynamicArray);
        System.out.println("Size: " +dynamicArray.size);
        System.out.println("Capacity: " +dynamicArray.capacity);
    }
}