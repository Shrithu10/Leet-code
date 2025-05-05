class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary, (a, b) -> a.length() - b.length());

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String replacement = word;
            for (String root : dictionary) {
                if (word.startsWith(root)) {
                    replacement = root;
                    break;
                }
            }
            result.append(replacement).append(" ");
        }
        return result.toString().trim(); 
    }
}
