class Solution {
public:
    int differenceOfSums(int n, int m) {
        int sum=0;int diff=0;
        for(int i=0;i<=n;i++){
            if(i%m!=0){cout<<i<<" ";
                sum=sum+i;
            }else{diff=diff+i;}
        }return sum-diff;
    }
};