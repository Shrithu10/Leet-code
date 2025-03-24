class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String s : arr) {
            if (s.length() <= 2) {
                result.append(s.toLowerCase());
            } else {
                result.append(s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase());
            }
            result.append(" ");
        }
        
        return result.toString().trim();
    }
}
