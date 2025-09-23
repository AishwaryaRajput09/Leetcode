class Solution {
    public int compareVersion(String version1, String version2) {
        int len1 = version1.length();
        int len2 = version2.length();
        int i = 0;
        int j = 0;
        while(i < len1 || j < len2){
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();

            while(i < len1 && version1.charAt(i) != '.'){
                s1.append(version1.charAt(i));
                i++;
            }
            while(j < len2 && version2.charAt(j) != '.'){
                s2.append(version2.charAt(j));
                j++;
            }
            int num1 = s1.length() == 0 ? 0 : Integer.parseInt(s1.toString());
            int num2 = s2.length() == 0 ? 0 : Integer.parseInt(s2.toString());
            if(num1 < num2){
                return -1;
            }else if(num1 > num2){
                return 1;
            }
            i++;
            j++;
        }
        return 0;

    }
}