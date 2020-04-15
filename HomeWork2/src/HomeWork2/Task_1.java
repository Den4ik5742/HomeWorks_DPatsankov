package HomeWork2;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number a:");
        double a = in.nextDouble();
        System.out.println("Enter number b:");
        double b = in.nextDouble();
        System.out.println("Enter number r:");
        double r = in.nextDouble();
        double diagonal = getDiagonal(a, b);
        String result = checkFigures(diagonal, r);
        System.out.printf("Answer : %s", result);
    }

    public static double getDiagonal(double a, double b){
        double diagonal;
        diagonal = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return diagonal;
    }

    public static String checkFigures(double diagonal, double r){
        double diameter;
        diameter = r * 2;
        String result = "";
        if (diagonal <= diameter){
            result = "The circle covers the rectangle.\n";
        }
        else if (diagonal > diameter){
            result = "The circle does not cover the rectangle.\n";
        }
        return result;
    }
}
