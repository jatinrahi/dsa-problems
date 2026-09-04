class Solution {
    public int[] singleNumber(int[] nums) {
         int res=0;
    for (int i=0;i<nums.length;i++){
        res=res^nums[i];
    }
    int diffbit=res & (-res);
    int a=0;
    int b=0;
    for(int i=0;i<nums.length;i++){
        
            if((nums[i] & diffbit)==0){
                a=a^nums[i];
            }
            else{
                b=b^nums[i];
            }
    }
            return new int[]{a,b};
            
    
    





        
    }
}