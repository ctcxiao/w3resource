import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class InputExercises18{
    public static void main(String[] args) {
        try {
            new InputExercises18().findLongestWords();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String findLongestWords() throws FileNotFoundException {

        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File("E://test.txt"));
        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }
        }
        System.out.println("\n"+longest_word+"\n");
        return longest_word;
    }
}