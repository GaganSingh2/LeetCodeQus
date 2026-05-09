class Solution {
    public int[] scoreValidator(String[] events) {
        int counter = 0, score = 0;
        int si = 0;
        while(si<events.length){
            if(events[si].equals("W")){
                counter++;
                if(counter == 10) break;
            }
            else if(events[si].equals("WD") || events[si].equals("NB")){
                score++;
            }
            else{
                score += Integer.parseInt(events[si]);
            }
            si++;
        }
        return new int[]{score,counter};
    }
}