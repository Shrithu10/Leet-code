class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
        
            for(int k=0;k<image.size();k++){
                
                reverse(image[k].begin(),image[k].end());
                
            }
        for(int i=0;i<image.size();i++){
            for(int j=0;j<image.size();j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                    
                }else{
                    image[i][j]=0;
                }
                cout<<image[i][j]<<" ";
            }
            }return image;
        }
    };
