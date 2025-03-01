import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ShopingCartProgram {
    public static void main(String[] args) {
        // Shopping Cart Program

        Scanner scanner = new Scanner(System.in);

        String item;
        int quantity;
        double price;
        char currency ='$';
        double total;

        System.out.print(" What do you like  to Buy ?");
        item = scanner.nextLine();

        System.out.print(" what is the price for each");
        price = scanner.nextDouble();

        System.out.print("how many item you like ");
         quantity= scanner.nextInt();

         total = price * quantity;
         System.out.println("\n You Have Bought " + quantity + " items of " + item );
         System.out.println(" Your Total is " +  currency+ total);








        scanner.close();
    }






}


