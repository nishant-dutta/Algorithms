package org.algorithms.recursion;

import java.util.OptionalLong;
import java.util.stream.LongStream;

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

        System.out.println(factorial.findFactorialUsingStream(3));
        System.out.println(factorial.findFactorialUsingStream(-3));
        System.out.println(factorial.findFactorialUsingStream(-1));
        System.out.println(factorial.findFactorialUsingStream(0));
    }

    public OptionalLong findFactorialUsingStream(int number){
        if(number > 0){
            return LongStream.rangeClosed(1, number)
                    .parallel()
                    .reduce((a,b) -> a*b);
        } else if (number < 0) {
            return LongStream.rangeClosed(number, -1)
                    .parallel()
                    .reduce((a,b) -> a*b);
        }else {
            return OptionalLong.of(1);
        }
    }

}
