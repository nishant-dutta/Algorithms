package org.algorithms.recursion;

/*
 * Find Factorial of a number recursively. Consider negative inputs as well.
 * */
public class Factorial {
    public long findFactorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return n * findFactorial(n + 1);
        } else {
            return n * findFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.findFactorial(3));
        System.out.println(factorial.findFactorial(-3));
        System.out.println(factorial.findFactorial(-1));
        System.out.println(factorial.findFactorial(0));
    }

}
