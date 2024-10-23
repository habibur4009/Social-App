import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String userName;
        String password;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user Name:");
        userName = scanner.nextLine();

        System.out.println("Enter password:");
        password = scanner.nextLine();

        System.out.println("Enter your age:");
        age = scanner.nextInt();

        System.out.println (userName);

        System.out.println (password);

        System.out.println (age);


if (userName.isEmpty()){
System.out.println("Enter your name");

}


    }
}