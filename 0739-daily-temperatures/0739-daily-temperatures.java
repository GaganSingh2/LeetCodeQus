class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        Stack<Integer> track = new Stack<>();
        int dailyTemp[] = new int[len];
        
        
        for(int i=0; i<len; i++){
          
            while(!track.isEmpty() && temperatures[i] > temperatures[track.peek()]){
                
                int idx = track.pop();
                dailyTemp[idx] = i-idx;
            }
            
            track.push(i);
            //count=1;
        }

        return dailyTemp;
    }
}