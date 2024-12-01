import java.util.*;



public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("|                             |");
        System.out.println("===============================");

        System.out.printf("| %-7s | %-7s | %-7s |%n", "1(+)", "2(-)", "3(*)");
        System.out.println("|---------|---------|---------|");
        System.out.printf("| %-7s | %-7s | %-7s |%n", "4(/)", "5(%)", "6(^)");
        System.out.println("|---------|---------|---------|");
        System.out.printf("| %-7s | %-7s | %-7s |%n", "7(√)", "8(n!)", "9(log)");
        System.out.println("|---------|---------|---------|");
        System.out.printf("| %-2s | %-2s | %-2s |%n", "10(sin)", "11(|x|)", "12(Avg)");
        System.out.println("===============================");
        int operation;
        do {
            System.out.println("select the operation enter 0 to terminate:");
            operation = input.nextInt();
            if (operation == 0 || operation == 1 || operation == 2 || operation == 3 || operation == 4 || operation == 5 || operation == 6 || operation == 7 || operation == 8 || operation == 9 || operation == 10 || operation == 11 || operation == 12) {
                switch (operation) {
                    case 1:
                        Addition();
                        break;
                    case 2:
                        Subtract();
                        break;
                    case 3:
                        Multiply();
                        break;
                    case 4:
                        Division();
                        break;
                    case 5:
                        Modulus();
                        break;
                    case 6:
                        Power();
                        break;
                    case 7:
                        Square();
                        break;
                    case 8:
                        FactorialNumber();
                        break;
                    case 9:
                        log();
                        break;
                    case 10:
                        Sin();
                        break;
                    case 11:
                        Absolute();
                        break;
                    case 12:
                        Average();
                        break;

                }

            } else {
                System.out.println("please enter valid operation number");
            }
        } while (operation != 0);

    }

    public static void Addition() {
        Scanner input= new Scanner(System.in);
        System.out.println("enter first number:");
        double first = input.nextDouble();
        System.out.println("enter second number:");
        double second = input.nextDouble();
        System.out.println("the result is: " + (first + second));
    }

    public static void Division() {
        Scanner input= new Scanner(System.in);
        System.out.println("enter first number:");
        double first = input.nextDouble();
        System.out.println("enter second number:");
        double second = input.nextDouble();
        System.out.println("the result is: " + (first / second));

    }

    public static void Modulus() {
        Scanner input= new Scanner(System.in);
        System.out.println("enter first number:");
        double first = input.nextDouble();
        System.out.println("enter second number:");
        double second = input.nextDouble();
        System.out.println("the result is: " + (first % second));
    }

    public static void Square() {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the number:");
        double first = input.nextDouble();
        System.out.println("the square root of the number is: " + Math.sqrt(first));

    }

    public static void Sin() {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the degree:");
        double degree = input.nextDouble();
        System.out.println("the sin of the degree is: " + Math.sin(degree));
    }

    public static void Absolute() {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the number:");
        double number = input.nextDouble();
        System.out.println("the absolute value of the number is: " + Math.abs(number));
    }

    public static void Average() {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to sum : ");
        int arrayl = input.nextInt();
        double sum = 0;
        double[] array = new double[arrayl];
        System.out.println("Please enter the numbers : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
            sum += array[i];
        }
        double avg = sum / array.length;
        System.out.println("The average is :" + avg);
    }

    public static void FactorialNumber() {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number you want to factory (Integar): ");
        int number = input.nextInt();
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);

    }

    public static void Power() {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number you want to power : ");
        double number = input.nextDouble();
        System.out.println("Enter the power of " + number);
        double power = input.nextDouble();
        double powerofnumber = Math.pow(number, power);
        System.out.println("Result is: " + powerofnumber);

    }

    public static void Subtract() {
        Scanner input= new Scanner(System.in);
        System.out.println("enter first number:");
        double first = input.nextDouble();
        System.out.println("enter second number:");
        double second = input.nextDouble();
        System.out.println("the result of the subtraction is: "+(first-second));
    }

    public static void Multiply() {
        Scanner input= new Scanner(System.in);
        System.out.println("enter first number:");
        double first = input.nextDouble();
        System.out.println("enter second number:");
        double second = input.nextDouble();
        System.out.println("the result of the multiplication is: "+(first*second));

    }

    public static void log() {
        Scanner input= new Scanner(System.in);
        System.out.println("enter number for log");
        double x= input.nextDouble();
        if (x <= 0) {
            System.out.print("Error:The number must be greater than 0 to calculate the algorithm");


        }
        System.out.println("the log is: "+(Math.log(x)));
    }
}



