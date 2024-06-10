class Solution {
public:
    string eve(int x){
    if (x % 2 == 0)
        return "even";
    else
        return "odd";
}
        
bool isArraySpecial(vector<int>& nums) {
    int size = nums.size();
          
    for (int i = 0; i < size - 1; i++) {   
        if (eve(nums[i]) == eve(nums[i + 1]))
            return false;
    }
    return true;
}
};