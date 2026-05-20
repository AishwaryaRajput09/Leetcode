class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length;

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        int[] C = new int[n];

        int total = 0;

        for(int i = 0; i < n; i++) {

            if(A[i] == B[i]) {

                total++;

            } else {

                if(map2.containsKey(A[i])) {
                    total++;
                }

                if(map1.containsKey(B[i])) {
                    total++;
                }
            }

            map1.put(A[i], 1);
            map2.put(B[i], 1);

            C[i] = total;
        }

        return C;
    }
}