/*
 * Chapter 7: Lab exercises
 * Interfaces - Using the Comparable Interface
 */

public class CoinFlip {
    //-----------------------------------------------------------------
    //  Creates a Coin object, flips it, and prints the results.
    //-----------------------------------------------------------------

    public static void main(String[] args) {
        double bias = 0.7;
        int[] flipResults = new int[6]; // [c1.heads, c1.tails, c2.heads, c2.tails, c3.heads, c3.tails,]

        BiasedCoin myCoin1 = new BiasedCoin();
        System.out.println(myCoin1);
        BiasedCoin myCoin2 = new BiasedCoin(bias);
        System.out.println(myCoin2);
        BiasedCoin myCoin3 = new BiasedCoin(bias);
        System.out.println(myCoin3);
        
        for (int i = 0; i < 100; i++) {
            myCoin1.flip();
            if (myCoin1.isHeads()) { flipResults[0] = flipResults[0] + 1; }
            else { flipResults[1] = flipResults[1] + 1; }
            myCoin2.flip();
            if (myCoin2.isHeads()) { flipResults[2] = flipResults[2] + 1; }
            else { flipResults[3] = flipResults[3] + 1; }
        }
        
        System.out.println("*** Heads: " + flipResults[0] +  "  Tails: " + flipResults[1] );
        System.out.println("*** BIASED Heads: " + flipResults[2] +  "  BIASED Tails: " + flipResults[3] );
    }
}
