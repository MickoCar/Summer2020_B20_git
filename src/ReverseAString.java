import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");//cat
        String str = scan.nextLine();

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse += ch;
        }
        System.out.println(reverse);
    }
}