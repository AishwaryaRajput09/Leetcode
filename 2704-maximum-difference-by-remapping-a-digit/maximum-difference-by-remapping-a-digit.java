class Solution {
    public int minMaxDifference(int num) {
        int maxNum = 0;
        int minNum = 0;
        int tempNum = num;
        int cnt = 0;
        while (tempNum > 0) {
            int rem = tempNum % 10;
            tempNum = tempNum / 10;
            cnt++;
        }
        int temp[] = new int[cnt];
        int temp2[] = new int[cnt];
        int temp4[] = new int[cnt];
        int j = 0;
        int size = temp.length - 1;
        while (num > 0) {
            int rem = num % 10;
            temp[size] = rem;
            num = num / 10;
            size--;
        }
        int minReplace = temp[0];
        int maxReplace = -1;
        for (int i = 0; i < cnt; i++) {
            if (temp[i] != 9) {
                maxReplace = temp[i];
                break;
            }
        }
        for (int i = 0; i < cnt; i++) {
            if (temp[i] == maxReplace) {
                temp2[i] = 9;
            } else {
                temp2[i] = temp[i];
            }
        }
        for (int i = 0; i < cnt; i++) {
            if (temp[i] == minReplace) {
                temp4[i] = 0;
            } else {
                temp4[i] = temp[i];
            }
        }

        for (int i = 0; i < cnt; i++) {
            maxNum = maxNum * 10 + temp2[i];
        }
        for (int i = 0; i < cnt; i++) {
            minNum = minNum * 10 + temp4[i];
        }
        return maxNum - minNum;
    }
}