class Solution {
    public int[] singleNumber(int[] nums) {
        int []b=new int[2];
        int l=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j])
                c=c+1;
            }
                if(c==1){
                b[l]=nums[i];
                l++;
        }
        }
          return b;
          
    }
}
