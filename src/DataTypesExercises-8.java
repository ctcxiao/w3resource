import java.util.Scanner;

class PowComputer{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        System.out.println("Square: "+Math.pow(number, 2));
        System.out.println("Cube: "+Math.pow(number, 3));
        System.out.println("Fourth power: "+Math.pow(number, 4));
    }
}