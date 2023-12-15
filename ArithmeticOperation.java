import java.util.Scanner;
public class ArithmeticOperation {
    private int a,b;
    private static Scanner sc = new Scanner(System.in);
    ArithmeticOperation(){
        System.out.print("Enter value of a: ");
        a = sc.nextInt();
        System.out.print("Enter value of b: ");
        b = sc.nextInt();
    }
    public void add(){
        System.out.println(a+" + "+b+" = "+(a+b));
    }
    public void sub(){
        System.out.println(a+" - "+b+" = "+(a-b));
    }
    public void mul(){
        System.out.println(a+" X "+b+" = "+(a*b));
    }
    public void div(){
        System.out.println(a+" / "+b+" = "+(a/b));
    }
    public static void main(String[] args) {
        System.out.print("----------------------------------------------------------------------\nChoose(1.Addition/2.Subtraction/3.Multiplication/4.Division/5.Exit):");
        int y = sc.nextInt();
        while(y!=5){
            if(y==1){
                 ArithmeticOperation x = new ArithmeticOperation();
                x.add();
            }
            else if(y==2){
                 ArithmeticOperation x = new ArithmeticOperation();
                x.sub();
            }
            else if(y==3){
                 ArithmeticOperation x = new ArithmeticOperation();
                x.mul();
            }
            else if(y==4){
                 ArithmeticOperation x = new ArithmeticOperation();
                x.div();
            }
            else{
                System.out.println("Enter valid input!!!");
            }
            System.out.print("----------------------------------------------------------------------\nChoose(1.Addition/2.Subtraction/3.Multiplication/4.Division/5.Exit):");
            y = sc.nextInt();
        }
        
    }
}