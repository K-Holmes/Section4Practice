import java.util.Random;
import java.util.Scanner;

public class ComputeMethods {
//    public static void main(String[] args) {
//
//    }

    public static String fToC (double degreesF) {

//        Scanner sc = new Scanner(System.in);
//        double ftemp, ctemp;
//        System.out.println("Give the temp in fahrenheit to convert to celsius");
//        ftemp = sc.nextDouble();
        double ctemp = (5.0/9)*(degreesF-32);
        String message = degreesF +" in celsius is " + ctemp;
//        sc.close();
        return message;
    }

    public static String hypotenuseSolve (int a, int b) {
//        Scanner sc = new Scanner(System.in);
//        double legA, legB, hypotenuse;
//        System.out.println("Give leg a length: ");
//        legA = sc.nextDouble();
//        System.out.println("Give leg b length: ");
//        legB = sc.nextDouble();
        double hypotenuse = (Math.sqrt(Math.pow(a, 2)+ (Math.pow(b, 2))));
        String message = "The hypotenuse is " + hypotenuse;
        return message;
    }

    public static String roll () {
        Random rnd = new Random();
        int die1, die2, sum;
        die1 = rnd.nextInt(7)+1;
        die2 = rnd.nextInt(7)+1;
        sum = die1+die2;
        String message = die1 + " + " + die2 + " = " + sum;
        return message;
    }

}
