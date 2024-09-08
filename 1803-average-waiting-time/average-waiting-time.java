class Solution {
    public double averageWaitingTime(int[][] customers) {
        double total = 0;
        int serviceEndTime = 0;

        for (int[] customer : customers) {
            int arrival = customer[0];
            int serviceTime = customer[1];

            if (serviceEndTime < arrival) {
                serviceEndTime = arrival;
            }

            total += serviceEndTime - arrival + serviceTime;
            serviceEndTime += serviceTime;
        }

        return total / customers.length;
    }
}
