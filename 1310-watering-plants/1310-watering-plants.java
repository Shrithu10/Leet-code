class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int w=capacity;
        int steps=0;
        for(int i =0;i<plants.length;i++){
            if(w>=plants[i]){
                
            w=w-plants[i];
            steps=steps+1;
                
            }
            else{
                w=capacity-plants[i];
                steps=steps+(2*i)+1;
                
                
            }

        }return steps;
    }
}