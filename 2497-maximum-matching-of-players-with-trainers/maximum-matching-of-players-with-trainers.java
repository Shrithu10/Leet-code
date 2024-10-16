class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(trainers);
        Arrays.sort(players);
        int c=0;
        int i=0,j=0;
        while(i<players.length && j<trainers.length){
                if(players[i]<=trainers[j]){
                    c=c+1;
                    i++;
                    j++;
                }
          else{
            j++;
          }  
          }
        return c;
    }
}