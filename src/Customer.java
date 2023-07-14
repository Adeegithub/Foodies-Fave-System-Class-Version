import java.util.Scanner;

public class Customer {
    public static String firstName;
    public static String lastName;
    public static int burgersRequired;
    private static int burgerStock = 50;

    public Customer(String firstName, String lastName, int burgersRequired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.burgersRequired = burgersRequired;
    }




    public static Object createCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your First name: ");
        firstName = input.nextLine();
        System.out.print("Enter your second name: ");
        lastName = input.nextLine();
        System.out.print("Enter Number of bugers required: ");
        burgersRequired = input.nextInt();

        burgerStock = burgerStock - burgersRequired;
        checkBurgerStock();

        System.out.println(firstName + " " + lastName + " requested " + burgersRequired + " burgers " );
        return null;


    }

    public static void checkBurgerStock() {
        if (burgerStock <= 10) {
            System.out.println("WARNING! Low burger stock");
        }
    }
}
