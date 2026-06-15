class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            }

        ArrayList<Integer>[] arr = new ArrayList[nums.length + 1];

        for (int key : map.keySet()) {
        int freq = map.get(key);

        if (arr[freq] == null) {
        arr[freq] = new ArrayList<>();
         }

            arr[freq].add(key);
        }

        int [] res=new int[k];
        int idx=0;
        for(int i=arr.length-1;i>=0 && idx<k;i--){
            if(arr[i]!=null){
                for(int num:arr[i]){
                    res[idx]=num;
                    idx++;
                    if(idx==k){
                        return res;
                    }
                }
            }
        } 
        return res;

        

        
    }
}
