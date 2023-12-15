
class Solution {
public:
    string destCity(vector<vector<string>>& paths) {
        unordered_set<string> startCity;
        for(int i = 0 ; i < paths.size(); i++){
            startCity.insert(paths[i][0]);
        }
        for(int i = 0 ; i < paths.size(); i++){
            if(startCity.find(paths[i][1])==startCity.end()) return paths[i][1];
        }
        return "";
    }
};
