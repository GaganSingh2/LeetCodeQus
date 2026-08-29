class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int tempArr[] = nums.clone();
        Arrays.sort(tempArr);
        List<List<Integer>> grps = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int idx = -1;
        for(int i=0; i<tempArr.length; i++){
            if(i == 0 || (tempArr[i]-tempArr[i-1])>limit){
                grps.add(new ArrayList<>());
                idx++;
            }

            grps.get(idx).add(tempArr[i]);
            map.put(tempArr[i], idx);
        }

        int index[] = new int[grps.size()];
        for(int i=0; i<nums.length; i++){
            int currEle = map.get(nums[i]);
            nums[i] = grps.get(currEle).get(index[currEle]);
            index[currEle]++;
        }

        return nums;
    }
}