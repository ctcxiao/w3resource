import java.util.Scanner;

class Minutes2YearAndDaysConverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of minutes:");
        long minutes = scanner.nextLong();
        long year = minutes/(365*24*60);
        long days = (minutes/(24*60))%365;
        System.out.println(minutes+" minutes is approximately "+year+" years and "+ days+ " days");
    }
}