// Stacks = LIFO Data Structure. Last-In First-Out
//        = stores objects into a sort of "vertical towers"
//        = push() to add to the top
//        = pop() to remove from the top
//        = empty() to check whether the stack is empty or not (true or false) from the top
//        = peak() to check the topmost object from the stacks
//        = search() to search the number of place the object is located and if not located in the string then  displays -1

//Uses of stack = undo/redo features in text editor
//              = moving backard/forward in browser history
//              = backtracking algorithms (maze, files directories)
//              = calling functions (call stack)

import java.util.Stack;

class Stacks{
public static void main(String[] args){
        Stack<String> stack= new Stack<String>();
        System.out.println(stack.empty());
        stack.push("JavaScript");
        stack.push("Java");
        stack.push("Html");
        stack.push("CSS");
        stack.push("C");
        stack.push("C++");
        stack.push("Maths");
        stack.push("Physics");

        System.out.println(stack.peek());

        System.out.println(stack);

        String myFavSub = stack.pop();

        System.out.println(stack);

        System.out.println(myFavSub);

        System.out.println(stack.empty());

        System.out.println(stack.search("Java"));
        System.out.println(stack.search("Vyapti"));
        System.out.println(stack.search("Shah"));
        


    }
}