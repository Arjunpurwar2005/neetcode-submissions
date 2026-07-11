class Solution {
    public int maxArea(int[] heights) {
        int maxarea=0;
        int i=0;
        int j= heights.length-1;
        while(i<j){
            int area=0;
           
            if(heights[i]<heights[j]){
                 area=heights[i]*(j-i);
                 i++;

            }
            else if(heights[i]>heights[j]){
                 area=heights[j]*(j-i);
                 j--;

            }
            else{
                area=heights[i]*(j-i);
                i++;
                j--;
            }
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }
}
