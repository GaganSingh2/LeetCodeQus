class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int len = words.length;
        int targetIdx = Integer.MAX_VALUE;
        for(int i=0; i<len; i++){
            if(words[i].equals(target)){
                int clockWise = (i-startIndex + len) % len;
                int antiClockWise = (startIndex - i + len) % len;

                targetIdx = Math.min(targetIdx, Math.min(clockWise,antiClockWise));
            }
        }

        return targetIdx == Integer.MAX_VALUE ? -1: targetIdx;
    }
}