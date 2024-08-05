public class Bigzeronotation{
    public static void main(String[] args) {
        // describes the performance of algorithm as the amount of data increases
        // machine independent (number of speed to completion)
        // ignore smaller operations 0(n+1) -> 0(n)
        // examples = 0(1)
        //          = 0(n)
        //          = 0(log n)
        //          = 0(n^2)
        // n = amount of data (it's a variable like x)

        // 0(n) linear time  -->   int  aadUp (int n){
        //                              int sum =0;
        //                              for(int i =0; i<=n; i++){
        //                                  sum+=i;
        //                              }
        //                              return sum;
        //                         }
        // here if n = 1000000 then it takes 1000000 steps

        // 0(1) constant time --> int  aadUp (int n){
        //                              int sum = n * (n + 1) / 2;
        //                              return sum;
        //                         }
        // here if n = 1000000 then it takes 3 steps
    }
}