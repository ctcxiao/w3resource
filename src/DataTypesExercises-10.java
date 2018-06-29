import java.util.Scanner;

class NumberConverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input six non-negative digits:");
        String numLine = scanner.nextLine();

        for (int i = 0; i < numLine.length(); i++) {
            if (i == numLine.length() - 1){
                System.out.print(numLine.charAt(i));
            } else {
                System.out.print(numLine.charAt(i) + " ");
            }
        }
    }
}