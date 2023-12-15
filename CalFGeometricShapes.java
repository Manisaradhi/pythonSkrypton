import java.util.Scanner;
import java.lang.Math;

abstract class Shape {
    public abstract void area();
    public abstract void perimeter();
}

class Triangle extends Shape{
    private Scanner sc = new Scanner(System.in);
    int a,b,c;
    Triangle(){
        System.out.print("Enter side a of Triangle: ");
        a = sc.nextInt();
        System.out.print("Enter side b of Triangle: ");
        b = sc.nextInt();
        System.out.print("Enter side c of Triangle: ");
        c = sc.nextInt();
    }
    public void area(){
        int s = (a+b+c)/2;
        System.out.println("Area of Triangle with sides "+a+","+b+","+c+" is :"+(Math.sqrt(s*(s-a)*(s-b)*(s-c))));
    }
    public void perimeter(){
        System.out.println("Perimeter of Triangle with sides "+a+","+b+","+c+" is :"+(a+b+c));
    }
}

class Rectangle extends Shape{
    private Scanner sc = new Scanner(System.in);
    int l,b;
    Rectangle(){
        System.out.print("Enter length of Rectangle: ");
        l = sc.nextInt();
        System.out.print("Enter breadth of Rectangle: ");
        b = sc.nextInt();
    }
    public void area(){
        System.out.println("Area of Rectangle with length and breadth "+l+","+b+" is :"+(l*b));
    }
    public void perimeter(){
        System.out.println("Perimeter of Rectangle with length and breadth "+l+","+b+" is :"+(2*(l+b)));
    }
}

class Square extends Shape{
    private Scanner sc = new Scanner(System.in);
    int s;
    Square(){
        System.out.print("Enter side of Square: ");
        s = sc.nextInt();
    }
    public void area(){
        System.out.println("Area of square with side "+s+" is :"+(s*s));
    }
    public void perimeter(){
        System.out.println("Perimeter of square with side "+s+" is :"+(4*s));
    }
}

class Circle extends Shape{
    private Scanner sc = new Scanner(System.in);
    int r;
    Circle(){
        System.out.print("Enter radius of Circle: ");
        r = sc.nextInt();
    }
    public void area(){
        System.out.println("Area of circle with radius "+r+" is :"+(Math.PI*r*r));
    }
    public void perimeter(){
        System.out.println("Perimeter of square with side "+r+" is :"+(2*Math.PI*r));
    }
}

class Parallelogram extends Shape{
    private Scanner sc = new Scanner(System.in);
    int a,b,h;
    Parallelogram(){
        System.out.print("Enter side a of Parallelogram: ");
        a = sc.nextInt();
        System.out.print("Enter base b of Parallelogram: ");
        b = sc.nextInt();
        System.out.print("Enter height h of Parallelogram: ");
        h = sc.nextInt();
    }
    public void area(){
        System.out.println("Area of Parallelogram with side "+a+" base "+b+"and height "+h+" is :"+(b*h));
    }
    public void perimeter(){
        System.out.println("Perimeter of Parallelogram with side "+a+" base "+b+"and height "+h+" is :"+(2*(a+b)));
    }
}

class RegularHexagon extends Shape{
    private Scanner sc = new Scanner(System.in);
    int s;
    RegularHexagon(){
        System.out.print("Enter side of Regular Hexagon: ");
        s = sc.nextInt();
    }
    public void area(){
        System.out.println("Area of Regular Hexagon with side "+s+" is :"+(1.5*Math.sqrt(3)*s*s));
    }
    public void perimeter(){
        System.out.println("Perimeter of Regular Hexagon with side "+s+" is :"+(6*s));
    }
}

public class CalFGeometricShapes {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Choose:(1.Triangle/2.Rectangle/3.Square/4.Circle/5.Parallelogram/6.Regular Hexagon)");
        int c = sc.nextInt();
        Shape x= null;
        if(c==1){
            x = new Triangle();
        }
        else if(c==2){
            x = new Rectangle();
        }
        else if(c==3){
            x = new Square();
        }
        else if(c==4){
            x = new Circle();
        }
        else if(c==5){
            x = new Parallelogram();
        }
        else if(c==6){
            x = new RegularHexagon();
        }
        else{
            System.out.println("Invalid Input!!!");
        }
        if(c>=1 && c<=6){
            x.area();
            x.perimeter();
        }
    }
}