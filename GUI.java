import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is Your Age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");



        double height = Double.parseDouble(JOptionPane.showInputDialog("What is Your Height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}
