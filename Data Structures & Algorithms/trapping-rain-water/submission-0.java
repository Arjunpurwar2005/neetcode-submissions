class Solution {
    public int trap(int[] height) {
        int[] prefix =new int[height.length];
        int[] suffix = new int[height.length];
        int n=height.length;
        
        prefix[0]=0;
        
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],height[i-1]);
           
            
            
        }
        suffix[n-1]=0;
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],height[i+1]);

        }
        int sum=0;
        for(int i=0;i<n;i++){
            
            int water=Math.min(prefix[i],suffix[i])-height[i];
            if(water<0){
                water=0;
            }
            sum=sum+water;
        }
        return sum;
    }
}
