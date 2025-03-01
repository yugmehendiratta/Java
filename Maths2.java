import java.util.Scanner;

public class Maths2 {
    public static void main(String[] args) {

        /*HYPOTENUSE c=Math.sqrt(a2 +b2)
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;
        System.out.println("Enter the length of side A; ");
        a = scanner.nextDouble();

        System.out.println("Enter the length of side B; ");
        b = scanner.nextDouble();

        c =Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println(" The Hypotenuse ( side c) is : " + c + " meters");

        scanner.close();
*/

        // circumference = 2 *Math.PI * radius;
        // area = Math.PI * Math.pow(radius , 2);
        // volume = (4.0 /3.0) *Math.PI * Math.pow(radius , 3)

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print(" Enter the Radius");
        radius = scanner.nextDouble();

        circumference = 2* Math.PI *radius ;
        area = Math.PI * Math.pow(radius, 2);
        volume =4.0/3.0 * Math.PI * Math.pow( radius ,  3) ;

        System.out.println( " The area  is : "  + area  );
        System.out.println( " The circumference is : "  + circumference );
        System.out.println( " The volume is : "  + volume  );


        scanner.close ();

    }

}
