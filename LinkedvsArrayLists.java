import java.util.ArrayList;
import java.util.LinkedList;

//Array Lists are faster than the Linked Lists when to get an element 
// Linked Lists are faster than Array List when to remove an element for 
// Linked List - it begans at one end of linked list and traverse our linked list until we get index that we are looking for 
// Array List - it undergoes random access of elements

public class LinkedvsArrayLists{
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime; //long used for counting in nanoseconds
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        //***********Linked List***********
        startTime = System.nanoTime();
        linkedList.get(0);
        //do something
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList:\t" + elapsedTime + "ns");

        //***********Array List***********
        startTime = System.nanoTime();
        arrayList.get(0);
        //do something
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapsedTime + "ns");
        



         //***********Linked List 2***********
         startTime = System.nanoTime();
         linkedList.get(500000);
         //do something
         endTime = System.nanoTime();
         elapsedTime = endTime - startTime;
         System.out.println("LinkedList:\t" + elapsedTime + "ns");

        //***********Array List 2***********
        startTime = System.nanoTime();
        arrayList.get(500000);
        //do something
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapsedTime + "ns");

        


         //***********Linked List 3***********
         startTime = System.nanoTime();
         linkedList.get(999999); //it takes less time because compared to other linkedlists as 999999 is the second last number so it is easy to get that number
         //do something
         endTime = System.nanoTime();
         elapsedTime = endTime - startTime;
         System.out.println("LinkedList:\t" + elapsedTime + "ns");
        
        //***********Array List 3***********
        startTime = System.nanoTime();
        arrayList.get(999999);
        //do something
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapsedTime + "ns");


        

         //***********Linked List 4***********
         startTime = System.nanoTime();
         linkedList.remove(0); //this takes less time compared to the arraylist
         //do something
         endTime = System.nanoTime();
         elapsedTime = endTime - startTime;
         System.out.println("LinkedList:\t" + elapsedTime + "ns");
        
        //***********Array List 4***********
        startTime = System.nanoTime();
        arrayList.remove(0);//for removing an element array lists takes longer time because it has to move million elements one place towards the left
        //do something
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapsedTime + "ns");



         //***********Linked List 5***********
         startTime = System.nanoTime();
         linkedList.remove(500000); //this takes more time as it has to navigate to the middle as usual
         //do something
         endTime = System.nanoTime();
         elapsedTime = endTime - startTime;
         System.out.println("LinkedList:\t" + elapsedTime + "ns");
        
        //***********Array List 5***********
        startTime = System.nanoTime();
        arrayList.remove(500000); // it takes less time compared to arraylist4 as 500000 resquires less elements to be shifted 
        //do something
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapsedTime + "ns");



        //***********Linked List 6***********
        startTime = System.nanoTime();
        linkedList.remove(999999); //this takes less time as it has to navigate to the lesser because 999999 is at the end 
        //do something
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList:\t" + elapsedTime + "ns");
       
       //***********Array List 6***********
       startTime = System.nanoTime();
       arrayList.remove(999999); // it takes less time compared to arraylist5 as 999999 resquires less elements to be shifted 
       //do something
       endTime = System.nanoTime();
       elapsedTime = endTime - startTime;
       System.out.println("ArrayList:\t" + elapsedTime + "ns");
    }
}