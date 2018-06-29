import java.util.Scanner;

class BMIComputer{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input weight in pounds:");
        double weight = scanner.nextDouble();
        System.out.println("Input height in inches:");
        double height = scanner.nextDouble();

        double bmi = weight*0.4536/Math.pow(height*0.0254, 2);
        System.out.println("Body Mass Index is "+bmi);
    }
}