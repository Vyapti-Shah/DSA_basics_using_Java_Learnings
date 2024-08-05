public class Mergesort{
    public static void main(String[] args) {
        //Merge sort  - recursively divide array in 2, sort, re-combine
        //            - runtime complexity = 0(n log n)
        //            - space complexity = 0(n)
        //            - merge sort faster than selection sort, bubble sort and insertion sort but uses more memory than them because in
        //              merge sort we need to make new sub-arrays

        int array [] = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(array);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) {
            return; //base case
        }

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //leftArray
        int j = 0; //rightArray

        for(; i < length; i++){
            if (i < middle) {
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);


    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //indices

        //check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}