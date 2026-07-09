class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        int maxlen=1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i:set){
            if(set.contains(i-1)) continue;
            else{
                int count =1;
                int j=1;
                while(set.contains(i+j)){
                    count=count+1;
                    j++;
                }
               
                maxlen=Math.max(maxlen,count);
            }
        }
        return maxlen;
        
    }
}
