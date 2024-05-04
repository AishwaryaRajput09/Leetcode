class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int cnt = 0;
        int s = 0;
        int e = people.length - 1;
        
        while (s <= e) {
            if (people[s] + people[e] <= limit) {
                s++;
            }
            e--;
            cnt++;
        }
        
        return cnt;
    }
}
