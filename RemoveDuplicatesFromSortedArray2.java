//Time Complexity: O(n)
//Space Complexity: O(1)
public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int count = 1;
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count<=2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;

    }
}
