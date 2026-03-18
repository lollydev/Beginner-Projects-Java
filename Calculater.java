import java.util.Scanner;

public class Calculater {
    public static void main(String[] args){
        // step 1: create scanner to put input
        Scanner input = new Scanner(System.in);

        //Ask user for two numbers 
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        //Ask user to choose an operation
        System.out.print("Choose an operation: ");
        char operator = input.next().charAt(0);
        double result;

        //Preform calculation using switch
        switch(operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: "+result);
                break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result: "+result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result: "+result);
                    break;

                case '/':
                    if (num2 != 0){
                    result = num1 / num2;
                    System.out.println("Result: "+result);
                    } else {
                    System.out.println("Error: can't devid by 0");
                    }
                    break;

                default:
                    System.out.println("Invalid operator");
        }

        //Close scanner
        input.close();
    }
}