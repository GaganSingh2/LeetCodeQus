class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int totalTime = requests[0];
        int moveFloor = requests[0];
        for(int i=1; i<requests.length; i++){
            if(requests[i] == requests[i-1]){
                continue;
            }
            else if(requests[i] < requests[i-1]){
                moveFloor -= requests[i];
                totalTime += Math.abs(requests[i-1]-requests[i]);;
            }
            else{
                moveFloor += requests[i];
                totalTime += Math.abs(requests[i-1]-requests[i]);
            }
        }
        return totalTime;
    }
}