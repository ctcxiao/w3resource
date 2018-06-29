import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Exercises8{
    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input your name: ");
        String name = null;
        try {
            name = r.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Your name is: " + name);
    }
}