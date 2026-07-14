class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int low=0;
        int max=0;
        
        for(int high=0;high<s.length();high++){
            if(set.contains(s.charAt(high))){
                while(set.contains(s.charAt(high))){
                    set.remove(s.charAt(low));
                    low++;
                    
                }
                set.add(s.charAt(high));





                }
                else{
                    max=Math.max(max,high-low+1);

                    set.add(s.charAt(high));

                }


            }

        
        return max;
        
    }
}
