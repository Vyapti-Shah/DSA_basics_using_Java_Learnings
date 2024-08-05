public class Recusrion {
    public static void main(String[] args) {
        // Recursion - When a thing is defined in terms of itself
        //           - Apply the result of a procedure , to a procedure
        //           - A recursion method calls itself. Can be a substitute for iteration.
        //           - Divides a problems into sub problems of its same type as the original.
        //           - Commonly used with advanced sorting algorithm and navigating trees.
        // Advantages = easier to read , write & debug
        // Disadvantages = sometimes slower & uses more memory 

        //Programs have a data structures called as Call Stack = a Call Stack keeps track of the order in which our program needs to function 
        
        walk(5);
        System.out.println();
        System.out.println(factorial(7));
        System.out.println();
        System.out.println(power(2, 8));
    }

    private static void walk(int steps) {
        if (steps < 1) {
            return; //base case
        }
        System.out.println("You take a step!");
        walk(steps - 1); //recursive case
    }

    private static int factorial(int num) {
        if (num < 1) {
            return 1; //base case
        }
        return num * factorial(num - 1); //recursive case
    }

    private static int power(int base, int exponent) {
        if (exponent < 1) {
            return 1; //base case
        }
        return base * power(base, exponent - 1); //recursive case
    }
    
}
