package lt.vtvpmc.ems.akademijait.vilius;

public class Fibonacci {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(fibo(40));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public static int fibo(int n){
        if(n <2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }



}

