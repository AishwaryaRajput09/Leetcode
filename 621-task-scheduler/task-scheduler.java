
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] taskCount = new int[26];
        for (char task : tasks) {
            taskCount[task - 'A']++;
        }
        Arrays.sort(taskCount);
        
        int maxFreq = taskCount[25];
        int idleTime = (maxFreq - 1) * n;
        
        for (int i = 24; i >= 0 && taskCount[i] > 0; i--) {
            idleTime -= Math.min(taskCount[i], maxFreq - 1);
        }
        
        return Math.max(idleTime + tasks.length, tasks.length);
    }
}
