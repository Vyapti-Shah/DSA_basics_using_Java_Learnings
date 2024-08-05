public class Quicksort {
    public static void main(String[] args) {
        // Quick sort - moves smaller elements to the left of the pivot recursively divide array in 2 partitions
        //            - runtime complexity = Base Case 0(n log n)
        //                                 = Average Case 0(n log n)
        //                                 = Worst Case 0(n^2) if already sorted
        //            - space complexity = 0(log n)  due to recursion
        //            - quick sort faster than selection sort, bubble sort and insertion sort but uses more memory than them because in
        //              quick sort we need to make new sub-arrays
        
        int array [] = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        quickSort(array, 0, array.length - 1);

        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end <= start) {
            return; //base case
        }
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for(int j = start; j <= end - 1; j++){
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
