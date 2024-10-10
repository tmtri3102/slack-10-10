import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continueChoice;

        do {
            System.out.println("Programs:");
            System.out.println("1. Sum of odd numbers");
            System.out.println("2. Is the number prime?");
            System.out.println("3. Number of Days in a month");
            System.out.print("Select an option: ");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Pick a number from 11-99: ");
                    int num = input.nextInt();
                    int sum = 0;
                    if (num > 10 && num < 100) {
                        for (int i = 1; i <= num; i++) {
                            if (i % 2 != 0) {
                                sum += i;
                            }
                        }
                        System.out.println("Sum = " + sum);
                    } else {
                        System.out.println("Please pick another number.");
                    }
                    break;
                case 2:
                    System.out.print("Pick a number: ");
                    int number = input.nextInt();
                    int i = 2;
                    boolean check = true;
                    while (i <= Math.sqrt(number)) {
                        if (number % i == 0) {
                            check = false;
                            break;
                        }
                        i++;
                    }
                    if (check)
                        System.out.println(number + " is prime.");
                    else
                        System.out.println(number + " IS NOT prime.");
                    break;
                case 3:
                    System.out.print("Pick a month: ");
                    int month = input.nextInt();
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            System.out.println("31 days");
                            break;
                        case 2:
                            System.out.println("28 or 29 days");
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            System.out.println("30 days");
                            break;
                        default:
                            System.out.println("Invalid month");
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            // Reset to select program again
            System.out.print("Do you want to reset? (Y/N): ");
            continueChoice = input.next();

        } while (continueChoice.equalsIgnoreCase("Y")); // Reset if user choose Y

        System.out.println("End of program.");
    }
}
