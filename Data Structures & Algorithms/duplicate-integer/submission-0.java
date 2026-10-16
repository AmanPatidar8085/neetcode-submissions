class Solution {
    public boolean hasDuplicate(int[] nums) {
       int n=nums.length;
       HashSet<Integer>hs=new HashSet<>();
       for(int i=0;i<=nums.length-1;i++){
        hs.add(nums[i]);

       } 
       if(hs.size()==n)return false;
       else
        return true;
       
    }
}