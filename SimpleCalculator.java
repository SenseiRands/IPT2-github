public class SimpleCalculator {

public static double add(double a, double b){
    return a + b;
}
public static double subtract(double a, double b) {
    return a - b;
}
public static double multiply(double a, double b) {
    return a * b;
}
public static double divide(double a, double b) {
    if (b == 0) {
        throw new ArithmeticException("Division by zero is not allowed");
    }
    return a/b;
}
public static double modulus(double a, double b) {
    if (b == 0) {
        throw new ArithmeticException("Modulus by zero is not allowed");
    }
    return a % b;
}
}