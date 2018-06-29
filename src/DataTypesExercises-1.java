import java.util.Scanner;

class ConvertF2C{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a fahrenheit degree:");
        double degreeInf = scanner.nextDouble();
        double degreeInC = (5*(degreeInf-32.0))/9.0;
        System.out.println(degreeInf + " degree Fahrenheit is equal to " + degreeInC + " in Celsius");
    }
}