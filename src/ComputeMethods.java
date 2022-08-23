import java.util.Random;

public class ComputeMethods {
    public static void main(String[] args) {

    }

    public static String fToC (double degreesF) {
        double ctemp = (5.0/9)*(degreesF-32);
        String message = degreesF +" in celsius is " + ctemp;
        return message;
    }

    public static String hypotenuseSolve (int a, int b) {
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
