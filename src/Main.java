import java.util.Scanner;

public class Main extends Customer{
    private static String userChoice = "";
    private static int burgerStock = 50;

    public Main(String firstName, String lastName, int burgersRequired) {
        super(firstName, lastName, burgersRequired);
    }

    public static void main(String[] args) {
        System.out.println("**********  FOODIES FAVE FOOD CENTER!  **********");
        System.out.println(" Welcome to Foodies Fave Queue Management System.");
        displayMenu();

        FoodQueue foodQueue1 = new FoodQueue(2);
//        FoodQueue foodQueue2 = new FoodQueue(3);
//        FoodQueue foodQueue3 = new FoodQueue(5);



        foodQueue1.enqueue(createCustomer());
    }

    public static void displayMenu() {

        Scanner foodsFave = new Scanner(System.in);

        while (!userChoice.equals("999")) {
            System.out.println("\n");
            System.out.println("********   MENU   ********");
            System.out.println("100 or VFQ: View all Queues.");
            System.out.println("101 or VEQ: View all Empty Queues.");
            System.out.println("102 or ACQ: Add customer to a Queue.");
            System.out.println("103 or RCQ: Remove a customer from a Queue.");
            System.out.println("104 or PCQ: Remove a served customer.");
            System.out.println("105 or VCS: View Customers Sorted in alphabetical order");
            System.out.println("106 or SPD: Store Program Data into file.");
            System.out.println("107 or LPD: Load Program Data from file.");
            System.out.println("108 or STK: View Remaining burgers Stock.");
            System.out.println("109 or AFS: Add burgers to Stock.");
            System.out.println("999 or EXT: Exit the Program.");
            System.out.println("\n");

            System.out.print("Please enter an option: ");

            userChoice = foodsFave.nextLine().toUpperCase();

            switch (userChoice) {
                case "100", "VFQ" -> viewAllQueues();
                case "101", "VEQ" -> viewAllEmptyQueues();
                case "102", "ACQ" -> addCustomerToQueue();
                case "103", "RCQ" -> removeCustomer();
                case "104", "PCQ" -> removeServedCustomer();
                case "105", "VCS" -> viewCustomerInAscendingOrder();
                case "106", "SPD" -> storeProgramData();
                case "107", "LPD" -> loadProgramData();
                case "108", "STK" -> viewRemainingBurgers();
                case "109", "AFS" -> addBurgersToStock();
            }

            if (userChoice.equals("999") || userChoice.equals("EXT")) {
                exit();
            }

//            foodsFave.close();
        }
    }

    private static void viewAllQueues() {
//
        System.out.println("View All Queues option selected!");
//        System.out.print("\n");
//        System.out.println("*****************");
//        System.out.println("*    Cashiers   *");
//        System.out.println("*****************");
//
//        for (int i = 0; i < 5; i++) {
//            String cashier1;
//            cashier1 = (i < queue1.length && queue1[i].equals("X")) ? "X" : (i >= queue1.length) ? " " : "O";
//
//            String cashier2;
//            cashier2 = (i < queue2.length && queue2[i].equals("X")) ? "X" : (i >= queue2.length) ? " " : "O";
//
//            String cashier3;
//            cashier3 = queue3[i].equals("X") ? "X" : "O";
//
//            System.out.println("     " + cashier1 + "  " + cashier2 + "  " + cashier3 + "     ");
//        }
//        System.out.println("X-Not Occupied O-Occupied");
    }

//    private static boolean isQueueEmpty(String[] queue) {
//        for (String customer : queue) {
//            if (customer != null && !customer.equals("X")) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static void viewAllEmptyQueues() {
//        System.out.println("\n");
        System.out.println("View Empty Queues option selected!");
//        System.out.println("Empty Queues: ");
//        if (isQueueEmpty(queue1)) {
//            System.out.println("Queue 1 is empty.");
//        }
//        if (isQueueEmpty(queue2)) {
//            System.out.println("Queue 2 is empty.");
//        }
//        if (isQueueEmpty(queue3)) {
//            System.out.println("Queue 3 is empty.");
//        }
    }

    public static void addCustomerToQueue() {
        System.out.println("You've selected add customer: ");

        createCustomer();
//        Scanner input = new Scanner(System.in);
//
//        String customerName;
//        int queuePosition;
//        int queueNumber;
//
//        System.out.print("Enter your Name: ");
//        customerName = input.nextLine();
//
//        System.out.print("Enter number of burgers required? ");
//        int burgerCount = Integer.parseInt(input.nextLine());
//        burgerStock = burgerStock - burgerCount;
//        checkBurgerStock();
//
//        System.out.print("Enter the queue position: ");
//        queuePosition = Integer.parseInt(input.nextLine());
//
//        System.out.print("Enter the queue number to be assigned (1,2 or 3: ");
//        queueNumber = Integer.parseInt(input.nextLine());
//
//        String[] enteredQueue;
//        switch (queueNumber) {
//            case 1 -> enteredQueue = queue1;
//            case 2 -> enteredQueue = queue2;
//            case 3 -> enteredQueue = queue3;
//            default -> {
//                System.out.println("Entered Queue number is invalid.");
//                return;
//            }
//        }
//
//        enteredQueue[queuePosition - 1] = customerName;
//        System.out.println("Congratulations! " + customerName + " have ordered " + burgerCount + " burgers and have been assigned to the queue " + queueNumber + " with the position " + queuePosition);
    }

    public static void removeCustomer() {
        System.out.println("You are in remove Customer");
    }

    public static void removeServedCustomer() {
        System.out.println("You are in remove served Customer");
    }

    public static void viewCustomerInAscendingOrder() {
        System.out.println("You are in Sort Customer Method");
    }

    public static void storeProgramData() {
        System.out.println("You are in Store Program Data");
    }

    public static void loadProgramData() {
        System.out.println("You are in Load Program Data");
    }

    public static void viewRemainingBurgers() {
        System.out.println("You are in viewRemainingBurgers");
        System.out.print("remaining burgers: " + burgerStock);
    }

    public static void addBurgersToStock() {
        System.out.println("You selected  add burgers to stock");
        System.out.print("How many burgers do you want to add?: ");
        int addedBurgers;
        Scanner addBurger = new Scanner(System.in);
        addedBurgers = addBurger.nextInt();
        burgerStock = burgerStock + addedBurgers;
        System.out.println("Total number of burgers after restock: " + burgerStock);
    }

    public static void exit() {
        System.out.println("Thank You For Choosing us. See you next time...");
        System.exit(0);
    }

//    public static void checkBurgerStock() {
//        if (burgerStock <= 10) {
//            System.out.println("WARNING! Low burger stock");
//        }
//    }
}

