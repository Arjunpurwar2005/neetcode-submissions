class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int low=  0;
        int maxfreq=0;
        int maxlen=0;
        int size=0;
        for(int high=0;high<s.length();high++){
            freq[s.charAt(high)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(high)-'A']);
            size=high-low+1;
            while(size-maxfreq>k){
                freq[s.charAt(low)-'A']--;
                low++;
                size=high-low+1;
            }
           
            maxlen=Math.max(maxlen,size);


        }
        return maxlen;
        
    }
}
