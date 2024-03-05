import java.util.Scanner;
import javax.swing.JOptionPane;

public class helloworld{
    //main method
    public static void main (String args [])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, welcome to CAT1");

        System.out.println(4 + 3);

        System.out.println("Enter your 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter your 2nd number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: "+sum);

        String value1  = JOptionPane.showInputDialog(null, "Enter the 1st number: ");
        String value2  = JOptionPane.showInputDialog(null, "Enter the 2nd number: ");

        int num3 = Integer.parseInt(value1);
        int num4 = Integer.parseInt(value2);

        int sum2 = num3 + num4;
        JOptionPane.showMessageDialog(null, "The sum is:"+sum2);
    }
}