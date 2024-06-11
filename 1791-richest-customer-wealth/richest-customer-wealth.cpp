class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int max=0;
        int size=accounts.size();
        for(int i=0;i<size;i++){
            int sum=0;
            int k=accounts[i].size();
            for(int j=0;j<k;j++){
                sum=sum+accounts[i][j];
                cout<<sum<<" ";

            }
            if(sum>max){
                max=sum;
            }
        } return max;
    }
};