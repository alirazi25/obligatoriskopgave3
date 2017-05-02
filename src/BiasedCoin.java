/*
 * Chapter 7: Lab exercises
 * Interfaces - Using the Comparable Interface
 */

/**
 *
 * @author andrasacs
 */
public class BiasedCoin {

    private final int HEADS = 0;
    private final int TAILS = 1;

    private int face;
    private double bias;

    //-----------------------------------------------------------------
    //  Sets up the coin by flipping it initially.
    //-----------------------------------------------------------------
    public BiasedCoin() {
        bias = 0.5;
        flip();
    }

    //-----------------------------------------------------------------
    //  Overloading the constructor method
    //-----------------------------------------------------------------

    public BiasedCoin(double bias) {
        if ((bias <= 1 && bias >= 0)) {
            this.bias = bias;
        } else {
            this.bias = 0.5;
        }
        flip();
    }

    //-----------------------------------------------------------------
    //  Flips the coin by randomly choosing a face value.
    //-----------------------------------------------------------------
    public void flip() {
        double rand = Math.random();
        System.out.println(rand + " vs. bias " + bias);
        if ((rand) < bias) {
            face = 1;
        }
        else { face = 0;}
        
    }



//-----------------------------------------------------------------
//  Returns true if the current face of the coin is heads.
//-----------------------------------------------------------------
    public boolean isHeads() {
        System.out.println("Is heads? " + face);
        if (face == HEADS) { return true;} else {
        return false; }
    }

    //-----------------------------------------------------------------
    //  Returns the current face of the coin as a string.
    //-----------------------------------------------------------------
    public String toString() {
        String faceName;

        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }

        return faceName;
    }
}
