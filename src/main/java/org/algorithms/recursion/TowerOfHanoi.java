package org.algorithms.recursion;
// Good explanation on: https://www.youtube.com/watch?v=q6RicK1FCUs
public class TowerOfHanoi {
    // Approach: We will solve the problem for 1 disc then 2 disk then 3 disk and try to make a recursive call

    // Steps for moving 3 Discs from A to C using B
    // Move 2 i.e. n-1 discs from A to B using C
    // Move 1 disc from A to C
    // Move 2 i.e. n-1 discs from B to C using A

    public void moveDiscs(int source, int helper, int destination, int count){
        if(count > 0){
            moveDiscs(source, destination, helper, count-1 );
            System.out.println("Move a disk from " + source + " to " + destination);
            moveDiscs(helper, source, destination, count-1);
        }
    }

    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.moveDiscs(1, 2, 3, 3);
    }
}
