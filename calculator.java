import java.util.Scanner;

public class calculator{
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Cannot divided by zero");
        }
            return a/b;
        }


    }
