import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;




public class Main {


    public static String userInput;
    public static String checkInput;


    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine();

        System.out.println(anagram.createAnagram(userInput));



    }
}



