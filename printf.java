public class printf {
    public static void main(String[] args) {

        
        // printf() = is a method used to format output
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height =60.5;
        boolean isEmployed =true;

        System.out.printf(" hello %s\n " , name);
        System.out.printf(" Your name starts with a %c\n ", firstLetter);
        System.out.printf( " You are %d years old\n" , age);
        System.out.printf( " You are %f inches tall \n", height );
        System.out.printf( " Employed : %b \n", isEmployed );


        System.out.printf( " %s is %d years old " ,  name  , age );
        


    }
}
