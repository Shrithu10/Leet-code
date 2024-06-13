class Solution {
public:
    int minMovesToSeat(vector<int>& seats, vector<int>& students) {
        int s=seats.size();
        int c=0;
        int a;
        sort(seats.begin(), seats.end()); 
        sort(students.begin(), students.end()); 
        for(int i=0;i<s;i++){
            a=seats[i]-students[i];
            if(a>=0){
            c=c+a;}
            else{
                c=c+(-a);
            }
        }
        if(c>0){
        return c;}
        else{ return -c;}
    }
};