public class Selectionsort {
    public static void main(String[] args) {
        // Selection sort - search through an array and keep a track of the minimum value during each iteration. At the end of each iteration we swap iteration
        //                - runtime complexity = 0(n^2)
        //                - for small data set it can be okay but for large elements it can be difficult
        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        selectionSort(array);
        for(int i : array){
            System.out.println(i);
        }
    }

    private static void selectionSort(int [] array) {
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
