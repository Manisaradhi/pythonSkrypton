import java.util.Scanner;

public class StringPalindrome {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String r="";
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        if(s.equals(r))System.out.println(s+" is a palindrome");
        else System.out.println(s+" is not a palindrome");
    }
}
