class Solution {
    public int maxArea(int[] heights) {
        int maxarea=0;
        int low=0;
        int high=heights.length-1;
        while(low<high){
            int area=0;
            if(heights[low] < heights[high]){
                area=heights[low]*(high-low);
                low++;
            }
            else if(heights[low] > heights[high]){
                area=heights[high]*(high-low);
                high--;
            }
            else{
                area=heights[low]*(high-low);
                high--;
                low++;
            }
            maxarea=Math.max(area,maxarea);
        }
        return maxarea;
        
    }
}
