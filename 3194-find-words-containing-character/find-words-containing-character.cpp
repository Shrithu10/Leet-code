class Solution {
public:
    
    vector<int> findWordsContaining(vector<string>& words, char x) {
       int size=words.size();
       vector <int> a;
       
       for(int i=0;i<size;i++){
        cout<<words[i]<<" ";
        cout<<words[i].find(x)<<" ";
            if(words[i].find(x)<= (words[i].length())){
                a.push_back(i);
            };
       }return a;
    };
};