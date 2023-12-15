import java.math.BigInteger;

public class FibonacciSeries {
    public static void main(String[] args) {
        BigInteger n0=BigInteger.ZERO,n1= BigInteger.ONE,n2;
        System.out.print(n0+"  ");
        System.out.print(n1+" ");
        for(int i=0;i<98;i++){
            n2=n0.add(n1);
            System.out.print(" "+n2+" ");
            n0=n1;
            n1=n2;
        }
    }
}
