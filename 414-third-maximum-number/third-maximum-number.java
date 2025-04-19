class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : nums) {
            uniqueNumbers.add(num);
        }
        List<Integer> sortedNumbers = new ArrayList<>(uniqueNumbers);
        Collections.sort(sortedNumbers, Collections.reverseOrder());
        
        if (sortedNumbers.size() >= 3) {
            return sortedNumbers.get(2);
        } else {
            return sortedNumbers.get(0);
        }
    }
}