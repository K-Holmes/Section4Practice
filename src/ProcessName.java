import java.util.Scanner;

public class ProcessName {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String fullName = console.nextLine();
        int spacing = fullName.indexOf(' ');
        String firstName = fullName.substring(0, spacing);
        String firstInitial = firstName.substring(0, 1);
        String lastName = fullName.substring(spacing+1);
        String newName = lastName + ", " + firstInitial + ".";

        System.out.println("Your name is: " + newName);
    }
}