public class Recursion5MoveAllX {
    // Time Complexity = O(n+count) = O(n+n) = O(2n) = O(n)
    public static void moveAllX(String str, int index, int count, String newStr){
        //base case
        if (index==str.length()) {
            for(int i=0; i<count; i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        //logic
        char currchar = str.charAt(index);
        if (currchar == 'x') {
            count++;
            moveAllX(str, index+1, count, newStr);
        }
        else{
            newStr += currchar;
            moveAllX(str, index+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");
    }
}
