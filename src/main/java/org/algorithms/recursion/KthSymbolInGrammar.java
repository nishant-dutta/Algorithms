package org.algorithms.recursion;

public class KthSymbolInGrammar {

    public static void main(String[] args) {
        KthSymbolInGrammar kthSymbolInGrammar = new KthSymbolInGrammar();
        for(int n=1; n <= 5; n++){
            for(int k = 1; k <= Math.pow(2, n-1); k++){
                System.out.print(kthSymbolInGrammar.getKthSymbol(n,k));
            }
            System.out.println();
        }
    }

    public int getKthSymbol(int n, int k){
        if(k == 1){
            return 0;
        }else if(k <= Math.pow(2, n-1)){
            return getKthSymbol(n-1, k);
        }else{
            return negate(getKthSymbol(n-1, k-(int)Math.pow(2, n-1)));
        }
    }

    private int negate(int n){
        return n == 0 ? 1: 0;
    }
}
