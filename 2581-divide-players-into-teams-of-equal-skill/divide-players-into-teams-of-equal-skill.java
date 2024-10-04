class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int sum = skill[0] + skill[skill.length - 1];
        int i = 0;
        int j = skill.length - 1;
        long res= 0;
        while(i < j){
            if(skill[i] + skill[j] != sum) return -1;
            res += (long) skill[i] * skill[j];
            i++;
            j--;
        }
        return res;
    }
}