class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;

        for (int ops = 0; ops <= (n + 2) / 3; ops++) {
            int start = ops * 3;

            if (start >= n) return ops; 

           
            int[] temp = Arrays.copyOfRange(nums, start, n);
            Arrays.sort(temp);

           
            boolean isUnique = true;
            for (int i = 1; i < temp.length; i++) {
                if (temp[i] == temp[i - 1]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) return ops;
        }

        return (n + 2) / 3;
    }
}