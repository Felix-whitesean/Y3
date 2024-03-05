import java.util.Scanner;

public class ShoppingSystem {
    User currentUser;
    public static void main(String[] args) {
        ShoppingSystem shopping = new ShoppingSystem();
        System.out.println("Welcome to online shopping system.");
        System.out.println("1: Login");
        System.out.println("2: Register");
        System.out.println("What do you want to do? ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input ==1){
            shopping.currentUser = new User();
            shopping.currentUser.login();
        }
        else if(input == 2){
            User newUser = new User();
            newUser.signup();
        }
        else{
            System.out.println("Enter a valid input.");
        }
    }
    void addToCart(){

    }
    void checkOut(){

    }
}