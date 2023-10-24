package org.algorithms.recursion;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        else if (n % 2 == 1 || n == 0)
            return false;
        else
            return isPowerOfTwo(n / 2);
    }
}
