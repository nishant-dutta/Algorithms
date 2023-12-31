package org.algorithms.array.search;

// WAP to perform linear search in an array and return the index of an element(if found) or -1(if not found).
public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.search(new int[]{1,2,3,4,5}, 5));
    }

    public int search(int[] numbers, int searchValue){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == searchValue){
                return i;
            }
        }

        return -1;

    }
}
