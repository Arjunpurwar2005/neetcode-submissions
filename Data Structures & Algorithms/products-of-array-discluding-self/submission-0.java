class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] suff = new int[nums.length];
        int [] pref = new int[nums.length];
        int [] ans= new int[nums.length];
        suff[nums.length-1]=1;
        for(int i=nums.length-1;i>0;i--){
            suff[i-1]=suff[i]*nums[i];
            
        }
        pref[0]=1;
        for(int i=0;i<nums.length-1;i++){
            pref[i+1]=pref[i]*nums[i];
            

        }
        for(int i=0;i<nums.length;i++){
            ans[i]=pref[i]*suff[i];
        }
        return ans;

    }
}  
