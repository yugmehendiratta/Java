import com.sun.nio.sctp.SctpSocketOption;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        // if  statement = performs a block of code if its condition is true
        Scanner sc = new Scanner(System.in);

        int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are an Adult");
        }
        else if (age > 65) {
            System.out.println(" You are senior");
        }
        else if (age <  0) {
            System.out.println(" You Haven't been born yet");
        }
        else if (age == 0) {
            System.out.println(" You are a baby");
        }
        else {
            System.out.println("You are a child");
        }


    }
}
