/*
 * Chapter 7: Lab exercises
 * Interfaces - Using the Comparable Interface
 */

/**
 *
 * @author andrasacs
 */
public class Compare3 implements Comparable {
    
    public static Comparable largest(Comparable s1, Comparable s2, Comparable s3) {
        
        if ((s1.compareTo(s2)>0) && (s1.compareTo(s3)>0)) { return s1; }  
        if ((s2.compareTo(s2)>1) && (s2.compareTo(s3)>0)) { return s2; }
        if ((s3.compareTo(s1)>0) && (s3.compareTo(s1)>0)) { return s3; }
        return null;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
