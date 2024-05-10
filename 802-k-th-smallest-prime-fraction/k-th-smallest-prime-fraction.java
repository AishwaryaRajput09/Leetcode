import java.util.*;

class Fraction implements Comparable<Fraction> {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public int compareTo(Fraction other) {
        // Implement comparison logic
        return this.numerator * other.denominator - other.numerator * this.denominator;
    }
}

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Map<Fraction,int[]> map = new TreeMap<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                map.put(new Fraction(arr[i],arr[j]),new int[]{arr[i],arr[j]});
            }
        }
        Map<Fraction,int[]> sortedMap = new TreeMap<>(map);
        int count = 0;
        int[] res = null;
        for(int[] values : sortedMap.values()){
            count++;
            if(count == k){
                res = values;
                break;
            }
        }
        return res;
    }
}
