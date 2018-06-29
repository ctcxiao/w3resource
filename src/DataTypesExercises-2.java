import java.util.Scanner;

class Inches2MetersConverter{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a inches length:");
        double inches = scanner.nextDouble();
        double meters = inches*0.0254;
        System.out.println(inches + " inches is " + meters + " meters");
    }
}