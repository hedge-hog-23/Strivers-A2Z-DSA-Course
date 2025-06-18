class Solution {
    public boolean check(int[] nums) {
        int ct =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
            // System.out.println(i + " " + nums[i] + " "+ct);
            ct++;
            }
        }

        if(nums[nums.length-1] > nums[0]) ct++;
        // System.out.println(ct);
        return ct > 1 ? false : true;
    }
}
