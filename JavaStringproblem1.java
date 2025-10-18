class Solution {
    public int firstUniqChar(String s) {
        int freqArray[] = new int[26];
        char chars[] = s.toCharArray();
        for(char c : chars){
            freqArray[c - 'a']++;
        }
        for(int i=0;i< chars.length;i++){
            if(freqArray[chars[i] - 'a'] ==1){
                return i;
            }
        }
        return -1;
        
    }
}