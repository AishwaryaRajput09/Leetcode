class Solution {
    public int compareVersion(String ver1, String ver2) {
        int i = 0;
        int j = 0;
        int fe = ver1.length();
        int se = ver2.length();
        while (i < fe || j < se) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            while (i < fe && ver1.charAt(i) != '.') {
                sb1.append(ver1.charAt(i));
                i++;
            }
            while (j < se && ver2.charAt(j) != '.') {
                sb2.append(ver2.charAt(j));
                j++;
            }
            int num1 = sb1.length() == 0 ? 0 : Integer.parseInt(sb1.toString());
            int num2 = sb2.length() == 0 ? 0 : Integer.parseInt(sb2.toString());
            if (num1 < num2) return -1;
            if (num1 > num2) return 1;
            i++;
            j++;
        }
        return 0;
    }
}
