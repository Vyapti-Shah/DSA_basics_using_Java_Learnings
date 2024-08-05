public class Binarysearch {
    public static void main(String[] args) {
        // binary search - Search algorithm that finds the position of a target value within a sorted array
        //               - Half of an array is eliminated during each "step"
        //               - runtime complexity = 0(log n) therefore more efficient then other search algorithms

        // in binary search we always begin in the middle , we first check to see if our target value (the value's whose index is to be checked)
        // is equal to the middle value if they are equal the that index will be returned but is they are not equal then we will check to see if
        // the target value is greater than or lesser than the that middle value if the target value is greater than the middle value then it 
        // will disregard all the lesser values then again we will begin in the middle check to see if our target value is equal to the middle
        // value if not then check if the target value is greater than or less than the middle value and eliminate the other and find its index

        // disregard does not mean delete it means to no search from those disregarded part

        int array[] = new int[100];
        int target = 42;

        for(int i=0; i < array.length; i++){
            array[i] = i;
        }

        int index = binarySearch(array, target);
        //int index = Arrays.binarySearch(array, target); if this method used then 'private static int binarySearch(int[] array, int target)'
        //                                                                                                                            not needed

        if(index == -1){
            System.out.println(target+ " not found");
        }
        else{
            System.out.println("Element found at index: " +index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];
            System.out.println("middle: "+value);

            if(value < target){
                low = middle + 1;
            }
            else if(value > target){
                high = middle - 1;
            }
            else{
                return middle;
            }
        }
        return -1; //target not found
    }
}

//       Output - middle: 49
//                middle: 24
//                middle: 36
//                middle: 42
//                Element found at index: 42
// hence the above output took 4 steps to complete the program
