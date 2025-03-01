import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Name ? ");
        String name = scanner.nextLine();
        System.out.println("Enter a age ? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" What is Your Favourite Food ? ");
        String Food = scanner.nextLine();

        System.out.println( "Hello " + name + " !!");
        System.out.println( "You are " +  age + " years old");
        System.out.println( " You Like " + Food);
    }

}
