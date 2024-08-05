import java.util.*;
public class LinkedLists {
    public static void main(String[] args) {

        //LinkedList = stores Nodes in 2 parts (data + address)
        //           = Nodes are in non-consecutive memory locations
        //           = Elements are linked using pointers

        //                        Single Linked Lists
        //            Node                Node                Node
        //       [data | address] -> [data | address] -> [data | address]

        //                        Double Linked Lists
        //                  Node                          Node                          Node
        //       [address | data | address] -> [address | data | address] -> [address | data | address]

        // Advantages = Dynamic Data Structures (allocates needed memory while running)
        //            = Insertion and Deletion of node is easy 0(1)
        //            = No/Low memory waste

        //Disadvantages = Greater memory usage (additional pointer)
        //              = no random access of elements (no index[i])
        //              = Accessing/Searching elements is more time consuming 0(n)

        //Uses = implements Stacks/Queues
        //     = GPS navigation
        //     = music playlists

        //single LinkedLists = Those which have node consisting of the next elements address
        //double LinkedLists = Those which have node consisting of the previous elements and the next elements address
        // LinkedLists store the location of first and last nodes
        // LinkedLists have an inner class such as Nodes which store the memory location of previous and next element
        // LinkedLists implement a Deque interface //Deque is a double ended Queue //With deque intereface we implement 12 additional methods

                LinkedList<String> linkedLists = new LinkedList<String>();

                linkedLists.push("A");
                linkedLists.push("B");
                linkedLists.push("C");
                linkedLists.push("D");
                linkedLists.push("F");
                System.out.println(linkedLists);
                linkedLists.pop();//removes the last element(topmost)
                System.out.println(linkedLists);


                LinkedList<String> linkedList = new LinkedList<String>();
                linkedList.offer("A");
                linkedList.offer("B");
                linkedList.offer("C");
                linkedList.offer("D");
                linkedList.offer("F");
                System.out.println(linkedList);
                System.out.println(linkedList.indexOf("F"));;
                linkedList.add(4, "E");
                System.out.println(linkedList);
                linkedList.remove("F");
                System.out.println(linkedList);
                linkedList.poll();//removes the first element(topmost)
                System.out.println(linkedList);
                System.out.println(linkedList.peekFirst());
                System.out.println(linkedList.peekLast());
                linkedList.addFirst("0");
                linkedList.addLast("G");
                System.out.println(linkedList);

                String first = linkedList.removeFirst();
                String last = linkedList.removeLast();
                System.out.println(first);
                System.out.println(last);
    }
}