class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> a=new ArrayList();
    for(int i=0;i<operations.length;i++)
    {
        if (operations[i].equals("C")){
if (!a.isEmpty()) {
                    a.remove(a.size() - 1);
        }}
        else if (operations[i].equals("D")){
if (!a.isEmpty()) {
                    a.add(a.get(a.size() - 1) * 2);
        }}
        else if (operations[i].equals("+")){
int size = a.size();
                if (size >= 2) {
                    a.add(a.get(size - 1) + a.get(size - 2));
        } }
        else{
           a.add(Integer.parseInt(operations[i]));
        }}
        int totalSum = 0;
        for (int score : a) {
            totalSum += score;
        }

        return totalSum;
    }}