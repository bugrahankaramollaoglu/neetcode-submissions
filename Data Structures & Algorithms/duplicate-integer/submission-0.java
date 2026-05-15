class Solution {
    public boolean hasDuplicate(int[] nums) {

        // we are creating a hashset
        HashSet<Integer> seenBefore = new HashSet<>();

        for (int nb : nums) {
            if (seenBefore.contains(nb)) return true;
            seenBefore.add(nb);
        }

        return false;
    }
}