class Solution {

    // optimized hashmap O(n)

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<nums.length; i++) {
            int tamamlayan = target - nums[i];

            if (map.containsKey(tamamlayan)){
                return new int[]{map.get(tamamlayan), i};
            }

            map.put(nums[i], i);
        }

       

        return null;
    }
}
