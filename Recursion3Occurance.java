public class Recursion3Occurance {
    //Time Complexity = 0(n)
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int indx, char element) {
        //base case
        if (indx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        //logic
        char currchar = str.charAt(indx);
        if (currchar == element) {
            if (first == -1) {
                first = indx;
            }
            else{
                last = indx;
            }
        }
        findOccurance(str, indx+1, element);
    }
    public static void main(String[] args) {
        String str = "abcdaafeaah";
        findOccurance(str, 0, 'a'); 
    }
}
