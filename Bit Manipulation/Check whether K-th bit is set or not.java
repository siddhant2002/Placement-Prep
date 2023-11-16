package Bit Manipulation;

public class Solution {
    static boolean isKthBitSet(int n, int k) {
        String val=Integer.toBinaryString(n);
        return k <= val.length() && val.charAt(val.length()-k) == '1'; 
    }
}