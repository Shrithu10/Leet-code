class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(trainers);
        Arrays.sort(players);
        int c=0;
        int i=players.length-1,j=trainers.length-1;
        while(i>=0 && j>=0){
                if(players[i]<=trainers[j]){
                    c=c+1;
                    i--;
                    j--;
                }
          else{
            i--;
          }  
          }
        return c;
    }
}