class Solution {
    public int minTimeToType(String word) {
       int s=word.length();
       if(word.charAt(0)!='a') s=s+shortk('a',word.charAt(0));
       for(int i=1;i<word.length();i++){
        s=s+shortk(word.charAt(i-1),word.charAt(i));
       } 
       return s;
    }


    static int shortk(char start,char end){
    Map<Character, Integer> letters = new HashMap<>();
       letters.put('a', 1);letters.put('b', 2);letters.put('c', 3);letters.put('d', 4); letters.put('e', 5);letters.put('f', 6);
        letters.put('g', 7); letters.put('h', 8); letters.put('i', 9); letters.put('j', 10);letters.put('k', 11); letters.put('l', 12);
        letters.put('m', 13); letters.put('n', 14);letters.put('o', 15); letters.put('p', 16); letters.put('q', 17);letters.put('r', 18);  letters.put('s', 19);letters.put('t', 20);
        letters.put('u', 21);   letters.put('v', 22);  letters.put('w', 23); letters.put('x', 24); letters.put('y', 25);  letters.put('z', 26);
    
            return Math.min(Math.abs(letters.get(end) - letters.get(start)), 
         26 - Math.abs(letters.get(end) - letters.get(start)));

    }}
