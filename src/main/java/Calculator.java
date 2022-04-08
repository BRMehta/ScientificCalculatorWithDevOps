import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;


public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public double squareRoot(double var) {
        logger.info("Calculating Square Root of : " + var + "\n Result : " + Math.sqrt(var));
        return Math.sqrt(var);
    }
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num1=0, num2=0;
        int choice=0;
        while(true) {
            System.out.println("-----Calculator-----");
            System.out.println("Press 1 to find square root");
            System.out.println("Press any other key to exit");
            System.out.println("Enter your choice:");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Enter Integer number\n" + error);
                exit(-1);
            }

            switch (choice) {
                case 1:  // For Square Root
                    System.out.println("Square Root Operation:");
                    System.out.print("Enter the number: ");
                    try {
                        num1 = scanner.nextInt();
                    } catch (InputMismatchException error) {
                        System.out.println("Enter Integer number\n" + error);
                        exit(-1);
                    }
                    System.out.println("Square Root of " + num1 + " : " + calculator.squareRoot(num1));
                    break;
                default:
                    System.out.println("Exiting...");
                    exit(0);
            }
        }
    }
}