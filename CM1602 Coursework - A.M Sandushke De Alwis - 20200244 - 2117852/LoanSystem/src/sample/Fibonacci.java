package sample;

// Fibonacci series using loops
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
        int n;
        int a = 0;
        int b = 0;
        int c = 1;

        Scanner Fibo = new Scanner(System.in);
        System.out.print("Enter a value:");
        n = Fibo.nextInt();


        for(int i = 1; i <= n; i++){
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + " ");
        }
    }
}

////////////////////////////////////////////
//Fibonacci series using recursion

//public class Fibonacci{
//    public static void main(String[]args){
//        Scanner Fibo = new Scanner(System.in);
//
//        System.out.print("Enter your value:");
//        int n = Fibo.nextInt();
//
//        for(int i = 1; i<= n; i++){
//            System.out.println(fibonacci(i)+ " ");
//        }
//    }
//    private static int fibonacci(int n){
//        if(n == 1){
//            return 0;
//        }
//        else if(n == 2){
//            return 1;
//        }
//        else{
//            return fibonacci(n-2) + fibonacci(n-1);
//        }
//    }
//}