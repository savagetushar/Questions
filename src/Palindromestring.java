import java.util.*;
public class Palindromestring {
    public static void main(String[] args) {
        String str = "nayan";
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("not a plaimdrome");
                return;

            }
            i++;
            j--;

        }
        System.out.println("is a palimdrome");

    }
}
