public class Linearsearch{
    public static void main(String[] args) {
        // linear search - Iterate through a collection one element at a time 
        //               - runtime complexity : 0(n)
        // Disadvantage = slow for large data sets
        // Advantages = Fast for searches of small to medium data sets
        //            = Does not need to be sorted 
        //            = Useful for data structure that do not have random access (Linked List)
        int [] array = {9, 6, 8, 5, 7, 3, 1, 4, 2};
        int index = linearSearch(array, 10);
        if(index != -1){
            System.out.println("Element found at index : "+index);
        }
        else{
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}