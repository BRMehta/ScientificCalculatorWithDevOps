import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;


public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public double squareRoot(double var) {
        logger.info("SQUARE_ROOT - Input:" + var + " - Output:" + Math.sqrt(var));
        return Math.sqrt(var);
    }
    public long  factorial(int var){
        long fact = 1;
        for(int i = 1; i <= var; i++){
            fact *= i;
        }
        logger.info("FACTORIAL - Input:" + var + " - Output:" + fact);
        return fact;
    }
    public double logarithm(double var){
        logger.info("LOGARITHM - Input:" + var + " - Output:" + Math.log(var));
        return Math.log(var);
    }
    public double power(double number1, double number2) {
        double result = Math.pow(number1,number2);
        logger.info("POWER_FUNCTION - Input:" + number1 + "^" + number2 + " - Output:"+result);
        return result;
    }
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num1=0, num2=0;
        int n1=0;
        int choice=0;
        boolean flag;
        while(true) {
            System.out.println("-----Calculator-----");
            System.out.println("Press 1 to find square root");
            System.out.println("Press 2 to find factorial");
            System.out.println("Press 3 to find natural logarithm");
            System.out.println("Press 4 to find power");
            System.out.println("Press any other key to exit");
            flag=true;
            while(flag) {
                System.out.println("Enter your choice:");
                try {
                    choice = scanner.nextInt();
                    flag=false;
                } catch (InputMismatchException error) {
                    System.out.println("ERROR: Enter Integer number\n" + error);
                    scanner.nextLine();
                }
            }

            switch (choice) {
                case 1:  // For Square Root
                    System.out.println("Square Root Operation:");
                    flag=true;
                    while(flag) {
                        System.out.print("Enter the number: ");
                        try {
                            num1 = scanner.nextDouble();
                            if(num1<0) {
                                System.out.println("ERROR: Square root of negative number is not real number(i.e. complex number)!");
                                continue;
                            }
                            flag=false;
                        } catch (InputMismatchException error) {
                            System.out.println("ERROR: "+ error +" .Enter Double number.");
                            scanner.nextLine(); // to flush input stream
                        }
                    }
                    System.out.println("Square Root of " + num1 + " : " + calculator.squareRoot(num1));
                    break;
                case 2: // for Factorial
                    System.out.println("Factorial Operation:");
                    logger.info("[case 2: Factorial]");
                    flag=true;
                    while(flag) {
                        System.out.print("Enter the number: ");
                        try {
                            n1 = scanner.nextInt();
                            if(n1<0) {
                                System.out.println("ERROR: Factorial of negative number is not possible!");
                                continue;
                            }
                            flag=false;
                        } catch (InputMismatchException error) {
                            System.out.println("ERROR: "+ error +". Enter Integer number.");
                            scanner.nextLine(); // to flush input stream
                        }
                    }
                    System.out.println("Factorial of " + n1 + " : " + calculator.factorial(n1));
                    break;
                case 3:  // For Natural Logarithm
                    System.out.println("Natural Logarithm Operation:");
                    logger.info("[case 3: Natural Logarithm]");
                    flag=true;
                    while(flag){
                        System.out.print("Enter the number: ");
                        try {
                            num1 = scanner.nextDouble();
                            if (num1 < 0) {
                                System.out.println("ERROR: Cannot find log of negative numbers");
                                continue;
                            }
                            flag=false;
                        }catch (InputMismatchException error) {
                            System.out.println("ERROR: "+ error +". Enter Double number.");
                            scanner.nextLine(); // to flush input stream
                        }
                    }
                    System.out.println("Natural Logarithm of " + num1 + " : " + calculator.logarithm(num1));
                    break;
                case 4:
                    // find power
                    flag=true;
                    while(flag) {
                        System.out.print("Enter the first number : ");
                        try {
                            num1 = scanner.nextDouble();
                            flag = false;
                        } catch (InputMismatchException error) {
                            System.out.println("ERROR: " + error + ". Enter Double number.");
                            scanner.nextLine(); // to flush input stream
                        }
                    }
                    flag=true;
                    while(flag) {
                        System.out.print("Enter the second number : ");
                        try {
                            num2 = scanner.nextDouble();
                            flag = false;
                        } catch (InputMismatchException error) {
                            System.out.println("ERROR: " + error + ". Enter Double number.");
                            scanner.nextLine(); // to flush input stream
                        }
                    }
                    System.out.println(num1+ " raised to power "+num2+" is : " + calculator.power(num1, num2));
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Exiting...");
                    exit(0);
            }
        }
    }
}