package HomeWork3.Task_2;

public class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {

    }

    public double getA() {
        return a;
    }

    public double setA(double a) {
        this.a = a;
        return a;
    }

    public double getB() {
        return b;
    }

    public double setB(double b) {
        this.b = b;
        return b;
    }

    public void mathAction(String op) {
        switch (op) {
            case "+":
                sum();
                break;
            case "-":
                subtraction();
                break;
            case "*":
                Multiplication();
                break;
            case "/":
                Division();
                break;
            case "^":
                powAction();
                break;
            default:
                System.out.println("Операции не существует!");
                break;
        }
    }

    public void subtraction() {
        System.out.printf("\nВычитание = %.2f\n", a - b);
    }

    public void sum() {
        System.out.printf("\nСумма = %.2f\n", a + b);
    }

    public void Multiplication() {
        System.out.printf("\nУмножение = %.2f\n", a * b);
    }

    public void Division() {
        System.out.printf("\nДеление = %.2f\n", a / b);
    }

    public void powAction() {
        System.out.printf("\nа в степени b = %.2f\n", Math.pow(a, b));
    }
}
