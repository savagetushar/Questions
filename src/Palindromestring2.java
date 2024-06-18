import java.util.*;
public class Palindromestring2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you string");
        String str = sc.next();
        String org_st = str;
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }

        if (org_st.equals(rev)) {
            System.out.println(org_st + " a palindrome string");
        } else {
            System.out.println(org_st + " not a palindrome string");
        }
    }
}

