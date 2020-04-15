/*

Product of Array Except Self

Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:
Input:  [1,2,3,4]
Output: [24,12,8,6]

Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prod = new int[nums.length];
        
        prod[0] = 1;
        for(int i=1; i<nums.length; i++) {
            prod[i] = prod[i-1]*nums[i-1];
        }
        int temp = nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--) {
            prod[i] = prod[i]*temp;
            temp = temp*nums[i];
        }
        return prod;
    }
}
