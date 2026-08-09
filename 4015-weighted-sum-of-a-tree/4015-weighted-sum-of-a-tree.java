class Solution {
    private void depthOfTree(long depth[], Map<Integer, List<Integer>> tree, int node){
        if(!tree.containsKey(node)){
            return;
        }
        for(int child: tree.get(node)){
            depth[child] = depth[node] + 1;
            depthOfTree(depth, tree, child);
        }
    }
    public long weightedSum(int[] parent, int[] nums) {
        Map<Integer, List<Integer>> tree = new HashMap<>();

        for(int i=1; i<parent.length; i++){
            tree.computeIfAbsent(parent[i], K->new ArrayList<>()).add(i);
        }

        //calculate depth of every node
        long depth[] = new long[parent.length];
        depth[0] = 1;
        depthOfTree(depth, tree, 0);

        //find maximum height
        long height = 0;
        for(long d: depth){
            height = Math.max(d, height);
        }

        //find totalSum of weights of all nodes in tree
        long ans = 0;
        for(int i=0; i<nums.length; i++){
            long curr = nums[i] * (height - depth[i]+1);
            ans += curr;
        }
        return ans;
    }
}