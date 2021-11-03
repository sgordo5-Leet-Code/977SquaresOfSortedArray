public class Solution2 {
    //The goal is to have two pointers to the beginning of the array and the end.
    // Whichever is larger goes in the sorted array squared
    public int[] sortedSquares(int[] nums) {
        int low = 0;
        int up = nums.length - 1;
        int current = nums.length - 1;
        int[] answer = new int[nums.length];

        while (low <= up) {
            if (Math.abs(nums[low]) < nums[up]) {
                answer[current] = nums[up] * nums[up];
                current--;
                up--;
            } else {
                answer[current] = nums[low] * nums[low];
                current--;
                low++;
            }
        }
        return answer;
    }
}
