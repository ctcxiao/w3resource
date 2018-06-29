import java.util.Scanner;

class IntegerAdder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer between 0 and 1000:");
        String number= scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += (number.charAt(i)-'0');
        }
        System.out.println("The sum of all digits in "+number+" is "+sum);
    }
}