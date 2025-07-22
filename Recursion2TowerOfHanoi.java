public class Recursion2TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        //base case
        if (n == 1) {
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, src, helper, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}