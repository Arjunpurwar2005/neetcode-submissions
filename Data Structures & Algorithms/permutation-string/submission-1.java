class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            freq1[ch-'a']++;
        }

        int low=0;
        int high=s1.length()-1;
        for(int i=low;i<=high;i++){
            char ch=s2.charAt(i);
            freq2[ch-'a']++;
            if(Arrays.equals(freq1,freq2)){
                return true;
            }
            

        }
        while(high<s2.length()-1){
            low++;
            high++;
            freq2[s2.charAt(low-1)-'a']--;
            freq2[s2.charAt(high)-'a']++;

            if(Arrays.equals(freq1,freq2)){
                return true;
            }

            
        }

    return false;    
        
    }
}
