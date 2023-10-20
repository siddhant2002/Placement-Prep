package Placement-Prep.Recursion;

import java.util.*;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
        ArrayList<Long> nm=new ArrayList<>();
        task(nm,1,n,2);
        return nm;
    }
    public static void task(ArrayList<Long> nm, long ind, long n, long i)
    {
        if(ind<=n)
        {
            nm.add(ind);
            task(nm,ind*i,n,i+1);
        }
        else
        {
            return;
        }
    }
}