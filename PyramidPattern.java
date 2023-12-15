import java.util.Scanner;

public class PyramidPattern {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
