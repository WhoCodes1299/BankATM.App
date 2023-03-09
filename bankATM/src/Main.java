import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String tradingOptions =
                """
                to view balance --> 1
                to money withdraw --> 2
                to deposit money into different account -->3
                to exit --> press the 'e' key...""";

        Scanner scanner = new Scanner(System.in);

        double SheBalance = 2165;
        String SheIBAN = "TR2400 5628 458 596 9895 10 16";
        String SheAccount = "qwerty";
        String ShePassword = "1071";


        double HeBalance = 3584;
        String HeIBAN = "TR5635 5226 256 852 9662 51 34";
        String HeAccount = "yazılımcı";
        String HePassword = "1453";


        System.out.println("Welcome :) please enter the login");
        System.out.println("Username: ");
        String username = scanner.nextLine();

        System.out.println("password: ");
        String password = scanner.nextLine();

        if(username.equals("qwerty") && password.equals("1071")){
            System.out.println("She account enter the login");
            System.out.println(tradingOptions);
            System.out.println("-----");
            System.out.println("please make a choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> System.out.println("to view balance");
                case "2" -> {
                    System.out.println("Enter the amount to withdraw:");
                    int amountToBeWithdrawn = scanner.nextInt();
                    if (SheBalance >= amountToBeWithdrawn) {
                        SheBalance -= amountToBeWithdrawn;
                        System.out.println("available balance: " + SheBalance);
                    } else {
                        System.out.println("You don't have enough money in your balance!");
                    }
                }
                case "3" -> {
                    System.out.println("how much do you want to deposit?");
                    int amountToBeDeposited = scanner.nextInt();
                    if (amountToBeDeposited <= SheBalance) {
                        System.out.println("IBAN: ");
                        scanner.nextLine();
                        String amountToBeIBAN = scanner.nextLine();
                        if (amountToBeIBAN.equals(HeIBAN)) {
                            System.out.println("money is deposited to He");
                            SheBalance -= amountToBeDeposited;
                            HeBalance += amountToBeDeposited;
                            System.out.println("your balance: " + SheBalance);
                            System.out.println("He's balance: " + HeBalance);
                        }
                    }
                }
                case "e" -> System.out.println("to exit");
            }
        }else if (username.equals("yazılımcı") && password.equals("1453")){
            System.out.println("He account enter the login");
            System.out.println(tradingOptions);
            System.out.println("-----");
            System.out.println("please make a choice: ");
            String choice = scanner.nextLine();

            // ----------------------

            switch (choice) {
                case "1" -> System.out.println("to view balance");
                case "2" -> {
                    System.out.println("enter the amount withdraw");
                    int amountToBeWithdrawn = scanner.nextInt();
                    if (HeBalance >= amountToBeWithdrawn) {
                        HeBalance -= amountToBeWithdrawn;
                        System.out.println("available balance: " + HeBalance);
                    } else {
                        System.out.println("You don't have enough money in your balance!");
                    }
                }
                case "3" -> {
                    System.out.println("how much do you want to deposit?");
                    int amountToBeDeposited = scanner.nextInt();
                    if (amountToBeDeposited <= HeBalance) {
                        System.out.println("IBAN: ");
                        scanner.nextLine();
                        String amountToBeIBAN = scanner.nextLine();
                        if (amountToBeIBAN.equals(SheIBAN)) {
                            System.out.println("money is deposited to She");
                            SheBalance += amountToBeDeposited;
                            HeBalance -= amountToBeDeposited;
                            System.out.println("your balance: " + SheBalance);
                            System.out.println("He's balance: " + HeBalance);
                        }
                    }
                }
                case "e" -> System.out.println("to exit");
            }
        }else {
            System.out.println("username or password wrong!!");
        }
    }
}