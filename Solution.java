class Solution {
    public static boolean containsDuplicate(int[] nums) {
        int rFlag=0;
        for(int i=0; i<nums.length; i++){
            int var = nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]==var){
                    rFlag=1;
                }
            }
        }
        if(rFlag==1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int nums[] ={12,56,123,555,2226,78};
        
        System.out.println(containsDuplicate(nums));
    }

}