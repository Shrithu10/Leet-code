class Solution {
public:
    int numberOfEmployeesWhoMetTarget(vector<int>& hours, int target) {
        int size=hours.size();
        int c=0;
        for(int i=0;i<size;i++){
            if (hours[i]>=target){
                c=c+1;
            }
        }return c;
    }
};