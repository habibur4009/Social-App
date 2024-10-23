import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String userrName;
        String password;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user Name:");
        userrName = scanner.nextLine();

        System.out.println("Enter password:");
        password = scanner.nextLine();

        System.out.println("Enter your age:");
        age = scanner.nextInt();

        System.out.println (userrName);

        System.out.println (password);

        System.out.println (age);

    }
}