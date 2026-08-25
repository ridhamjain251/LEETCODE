class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int t= target-nums[i];
            if(map.keySet().contains(t)){
                return new int[]{i,map.get(t)};
            }
            map.put(nums[i],i);
        
        }
        return new int[]{-1,-1};
    } 
    
}