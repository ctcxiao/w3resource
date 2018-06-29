import java.util.Scanner;

class Computer{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st integer:");
        int num1 = scanner.nextInt();
        System.out.println("Input 2nd integer:");
        int num2 = scanner.nextInt();

        System.out.println("Sum of two integers: "+(num1+num2));
        System.out.println("Difference of two integers: "+(num1-num2));
        System.out.println("Product of two integers: "+num1*num2);
        System.out.println("Average of two integers: "+(num1+num2)/2.0);
        System.out.println("Distance of two integers: "+Math.abs(num1-num2));
        System.out.println("Max integer: "+(num1>num2?num1:num2));
        System.out.println("Min integer: "+(num1<num2?num1:num2));
    }
}