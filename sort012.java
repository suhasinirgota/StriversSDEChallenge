class Solution {
    public void sortZeroOneTwo(int[] nums) {
        int low=0, mid=0, high=nums.length -1;//total capacity allocated at creation not filled.
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
}}}}
class Main{
    public static void main(String [] args){
        int nums[]={1,1,2,2,1};
        Solution s=new Solution();
        s.sortZeroOneTwo(nums);
        for(int i=0;i<nums.length;i++){
System.out.println(nums[i]);
        }
    }
}