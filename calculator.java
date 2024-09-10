import java.util.Scanner;
 
public class calculator {
 
  
    public static int addition(int a, int b) {
        return a + b;
    }
 
    
    public static int subtraction(int a, int b) {
        return a - b;
    }
 
    
    public static int multiplication(int a, int b) {
        return a * b;
    }
 
    
    public static int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
 
    
    public static int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot mod by zero");
        }
        return a % b;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Choose an operation: +, -, *, /, %");
        char operation = scanner.next().charAt(0);
        int result = 0;
        boolean validOperation = true;
        switch (operation) {
            case '+':
                result = addition(num1, num2);
                break;
            case '-':
                result = subtraction(num1, num2);
                break;
            case '*':
                result = multiplication(num1, num2);
                break;
            case '/':
                try {
                    result = division(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    validOperation = false;
                }
                break;
            case '%':
                try {
                    result = modulus(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operation");
                validOperation = false;
        }
        if (validOperation) {
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}
    
    
