
class Solution {
public:
    string destCity(vector<vector<string>>& paths) {
        unordered_map<string, string> myMap;
        
        // Build the graph
        for (auto it : paths) {
            myMap[it[0]] = it[1];
        }
        
        string ans;
        
        // Find the destination city without outgoing edges
        for (auto it : paths) {
            if (myMap.find(it[1]) == myMap.end()) {
                ans = it[1];
                break;
            }
        }
        
        return ans;
    }
};
