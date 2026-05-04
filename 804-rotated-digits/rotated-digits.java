class Solution {
    public int rotatedDigits(int n) {
        HashSet<Integer> canRotate = new HashSet<>();
        HashSet<Integer> invalidNum = new HashSet<>();
        int cnt = 0;
        canRotate.add(2);
        canRotate.add(5);
        canRotate.add(6);
        canRotate.add(9);
        // invalidNum.add(0);
        // invalidNum.add(1);
        invalidNum.add(4);
        invalidNum.add(7);
        invalidNum.add(3);
        // invalidNum.add(8);
        for (int i = 0; i <= n; i++) {

            if (canRotateNum(i, canRotate, invalidNum)) {

                cnt++;
            }
        }
        return cnt;
    }

    public boolean canRotateNum(int k, HashSet<Integer> canRotate, HashSet<Integer> invalidNum) {
        boolean luck = false;
        while (k != 0) {
            int rem = k % 10;
            if (invalidNum.contains(rem)) {
                    return false;
                }
            if (canRotate.contains(rem)) {
                luck = true;
            }
            k = k / 10;

        }
        return luck ? luck: false;
    }
}