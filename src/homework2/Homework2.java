public class Homework2 {
    public static void main(String[] args) {

        System.out.println("Sum result = " + calculateSum(10, 22)); // Исправлена опечатка в имени метода

        System.out.println("Expression result = " + calculateExpression(20, -3, 5, 8));

        System.out.println("Last number result = " + calculateLastNumber(745)); // Исправлена опечатка в имени метода

        System.out.println("Circle area = " + calculateCircleArea(7.5));

        System.out.println("Circle perimeter = " + calculateCirclePerimeter(7.5));

        System.out.println("Calculate sum of digits result = " + calculateSumOfDigits(1234)); // Исправлено форматирование текста

        System.out.println("Calculate arithmetic mean result = " + calculateAverage(5, 6, 7, 3, 55));
    }

    public static int calculateSum(int a, int b) { // Исправлена опечатка в имени метода
        return a + b;
    }

    public static double calculateExpression(double a, double b, double c, double d) {
        return a + b * c / d;
    }

    public static int calculateLastNumber(int a) { // Исправлена опечатка в имени метода
        return a % 10;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static int calculateSumOfDigits(int abcd) {
        int ab = abcd / 100;
        int cd = abcd % 100;
        return ab + cd;
    }

    public static double calculateAverage(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e) / 5.0;
    }
}
