class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> digits = new ArrayList<>();
        for (int num : nums) {
            if (num > 9) {
                extractDigit(num, digits);
            } else {
                digits.add(num);
            }
        }
        int[] result = new int[digits.size()];
        int ind = 0;
        for (int num : digits) {
            result[ind++] = num;
        }
        return result;
    }

    public void extractDigit(int num, ArrayList<Integer> digits) {
        ArrayList<Integer> rev = new ArrayList<>();
        while (num != 0) {
            int rem = num % 10;
            rev.add(rem);
            num /= 10;
        }
        for (int i = rev.size() - 1; i >= 0; i--) {
            digits.add(rev.get(i));
        }
    }
}