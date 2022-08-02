package kz.ibr.trainers.trainer10;

public class FibonacciUtils {
    public static String getFibonacciSum(byte limit) {
        int fib1 = 0;
        int fib2 = 1;
        int fibN;
        int result=fib1 + fib2;
        if(limit <= 1){
            return "0";
        }

        for(int i=2; i < limit; i++){
            fibN = fib1 + fib2;
            //System.out.println("Fib-" + fibN);
            result += fibN;
            //System.out.println("Result = " + result);
            fib1 = fib2;
            fib2 = fibN;
        }
        return String.valueOf(result);
    }

    private FibonacciUtils(){

    }

    public static void main(String[] args) {
        System.out.println("Сумма чисел фибоначчи до 0 должна равняться 0 - " + FibonacciUtils.getFibonacciSum((byte) 0));
        System.out.println("Сумма чисел фибоначчи до 1 должна равняться 0 - " + FibonacciUtils.getFibonacciSum((byte) 1));
        System.out.println("Сумма чисел фибоначчи до 2 должна равняться 1 - " + FibonacciUtils.getFibonacciSum((byte) 2));
        System.out.println("Сумма чисел фибоначчи до 3 должна равняться 2 - " + FibonacciUtils.getFibonacciSum((byte) 3));
        System.out.println("Сумма чисел фибоначчи до 4 должна равняться 4 - " + FibonacciUtils.getFibonacciSum((byte) 4));
        System.out.println("Сумма чисел фибоначчи до 5 должна равняться 7 - " + FibonacciUtils.getFibonacciSum((byte) 5));
        System.out.println("Сумма чисел фибоначчи до 6 должна равняться 12 - " + FibonacciUtils.getFibonacciSum((byte) 6));
        System.out.println("Сумма чисел фибоначчи до 7 должна равняться 20 - " + FibonacciUtils.getFibonacciSum((byte) 7));
    }
}