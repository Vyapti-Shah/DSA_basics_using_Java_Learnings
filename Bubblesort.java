public class Bubblesort{
    public static void main(String[] args) {
        //Bubble sort - a sorting algorithm that compares the json elements and checks to see if their in order if not then these elements are swaped
        //            - runtime complexity = 0(n^2)
        //            - for small data set it can be okay but for large elements it can be difficult
        int array []= {9, 1, 8, 2, 7, 3, 6, 4, 5};
        bubbleSort(array);

        for(int i : array){
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
}