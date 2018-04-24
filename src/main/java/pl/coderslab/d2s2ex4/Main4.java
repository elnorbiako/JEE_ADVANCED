package pl.coderslab.d2s2ex4;

public class Main4 {

    public static void main(String[] args) {
        MathOperation square = (i1) -> i1*i1;
        MathOperation root = (i1) -> Math.sqrt(i1);
        MathOperation factorial = (i1) -> fact( (int) i1);

        System.out.println("5 square = " + square.operate(5));
        System.out.println("36 root = " + root.operate(36));
        System.out.println("5 factorial = " + factorial.operate(5));

    }




        static int fact(int n) {
            int fac = 1;
            for (int i = n; i > 0; i--) {
                fac *= i;
            }
            return fac;
        }


}