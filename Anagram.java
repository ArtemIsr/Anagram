import java.util.StringJoiner;

public class Anagram {
    public static String SPACE = " ";
    public String desiredString;
    public  String reverseWord(String stringToReverse) {
        char[] stringToChar = stringToReverse.toCharArray();
        int arrayStart = 0;
        int arrayEnd = stringToChar.length - 1;

        while (arrayStart < arrayEnd) {
            if (Character.isLetter(stringToChar[arrayStart]) && Character.isLetter(stringToChar[arrayEnd])) {
                char temp = stringToChar[arrayStart];
                stringToChar[arrayStart] = stringToChar[arrayEnd];
                stringToChar[arrayEnd] = temp;

                arrayStart++;
                arrayEnd--;
            }
            else if (Character.isLetter(stringToChar[arrayStart]) && !Character.isLetter(stringToChar[arrayEnd])) {
                arrayEnd--;
            }
            else if (!Character.isLetter(stringToChar[arrayStart]) && Character.isLetter(stringToChar[arrayEnd])) {
                arrayStart++;
            }
            else {
                arrayStart++;
                arrayEnd--;
            }
        }

        return String.valueOf(stringToChar);
    }

    public  String createAnagram(String inputString) {
        String [] arr = inputString.split(SPACE);
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
        sj.add(reverseWord(arr[i]));
        }
        return desiredString = sj.toString();

    }
}
