public class CalcExecutionTime {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();

        //------- PROGRAM -------

        Thread.sleep(3000);

        //-----------------------

        long duration = (System.nanoTime() - start)/1000000; //divided by 1000000 to convert nanosec to millisec
        System.out.println("It takes " + duration + "ms to complete the execution");
    }
}
