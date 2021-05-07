import java.util.Scanner;

public class Password_Project {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner (System.in);
        System.out.println("\n" +
                "░██╗░░░░░░░██╗███████╗██╗░░░░░░█████╗░░█████╗░███╗░░░███╗███████╗\n" +
                "░██║░░██╗░░██║██╔════╝██║░░░░░██╔══██╗██╔══██╗████╗░████║██╔════╝\n" +
                "░╚██╗████╗██╔╝█████╗░░██║░░░░░██║░░╚═╝██║░░██║██╔████╔██║█████╗░░\n" +
                "░░████╔═████║░██╔══╝░░██║░░░░░██║░░██╗██║░░██║██║╚██╔╝██║██╔══╝░░\n" +
                "░░╚██╔╝░╚██╔╝░███████╗███████╗╚█████╔╝╚█████╔╝██║░╚═╝░██║███████╗\n" +
                "░░░╚═╝░░░╚═╝░░╚══════╝╚══════╝░╚════╝░░╚════╝░╚═╝░░░░░╚═╝╚══════╝");

        System.out.println("Welcome to the password hider program!");

        System.out.println("Please enter your name");

        String name = input.nextLine();

        System.out.println("Enter your password please");
        String pass = input.nextLine();

        System.out.println("Hiding your password, please wait");

        long start = System.currentTimeMillis();
        Thread.sleep(2000);

        System.out.println(" . \n . \n . \n . \n . \n");

        System.out.println("Here is the hidden password");

        for(char Y : pass.toCharArray()) {
            System.out.print('*');
        }
        System.out.println();
        input.close();

        System.out.println("Thank you for using my program");
    }
}
