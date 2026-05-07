class Solution {
    public static int[] twoSum(int[] nums, int target){
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                int result=nums[i]+nums[j];
                if (result==target){
                    return new int[] {i,j};
                }           
            }
        }
    }
}
public class TSMain{
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target=9; //get nums arr and target value from the user
        System.out.println("Input: nums = "+nums.toString()+", target = "+target);
        System.out.println("Output: "+Solution.twoSum(nums.toString(),target));
    }
} 

/**
 * import java.lang.Object;
class Solution {
    public static int[] twoSum(int[] nums, int target){
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                int result=nums[i]+nums[j];
                if (result==target){
                    return new int[] {i,j};
                }           
            }
        }
        return new int[] {-1,-1};
    }
}
public class TSMain{
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target=9; //get nums arr and target value from the user
        System.out.println("Input: nums = "+nums.toString()+", target = "+target);
        System.out.println("Output: "+Solution.twoSum(nums,target));
    }
} 
Submitted Answer
 */

/**
 * Correct answer
 * 
 */