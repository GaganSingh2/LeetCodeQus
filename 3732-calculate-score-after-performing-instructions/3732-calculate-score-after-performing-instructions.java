class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long score = 0;
        // int idx = 0;
        int si = 0, ei = values.length;
        Set<Integer> visit = new HashSet<>();
        while(si>=0 && si<ei && !visit.contains(si)){
            visit.add(si);
            if(instructions[si].equals("jump")){
                si += values[si];
            }
            else if(instructions[si].equals("add")){
                score += values[si];
                si++;
            }
        }
        return score;
    }
}