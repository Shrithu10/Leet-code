class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int w=capacity;
        int steps=0;
        for(int i =0;i<plants.length;i++){
            if(w>=plants[i]){
                System.out.println(plants[i]);
                
            w=w-plants[i];
            steps=steps+1;
            System.out.println("w" + w);
            System.out.println("s" + steps);
                
            }
            else{
                System.out.println(plants[i] + "  x");
                w=capacity;
                steps=steps+(2*i)+1;
                w=w-plants[i];
                
                
            System.out.println("s" + steps);
                
            System.out.println("w" + w);
            }

        }return steps;
    }
}