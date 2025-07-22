public class Recursion4CheckSortArr {
    // Time Complexity = O(n) where n = array length
    public static boolean isSorted(int arr[], int indx) {
        //base case
        if (indx == arr.length-1) {
            return true;
        }
        //logic
        if (arr[indx]<arr[indx+1]) {
            // array is sorted till now
            return isSorted(arr, indx+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5};
        int array[] = {1, 3, 3};
        System.out.println(isSorted(arr, 0));
        System.out.println(isSorted(array, 0));
    }
}
