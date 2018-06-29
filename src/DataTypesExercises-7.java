import java.util.Scanner;

class SpeedComputer{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input distance in meters:");
        double meters = scanner.nextDouble();
        System.out.println("Input hour:");
        int hour = scanner.nextInt();
        System.out.println("Input minutes:");
        int minutes = scanner.nextInt();
        System.out.println("Input seconds:");
        int seconds = scanner.nextInt();

        System.out.println("Your speed in meters/second is "+meters/(hour*3600+minutes*60+seconds));
        System.out.println("Your speed in km/h is "+(meters/1000.0)/(hour+minutes*1.0/60.0+seconds*1.0/3600.0));
        System.out.println("Your speed in miles/h is "+(meters/1609.0)/(hour+minutes*1.0/60.0+seconds*1.0/3600.0));
    }
}