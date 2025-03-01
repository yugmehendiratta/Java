import java.util.Random;

public class RandomName {
    public static void main(String[] args) {

         Random rand= new Random();

       boolean isHeads;

       isHeads = rand.nextBoolean();

       if(isHeads){
           System.out.print("Heads");
       }
       else {
           System.out.print("Tails");
       }
    }

}
