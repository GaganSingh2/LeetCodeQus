class Solution {
    public int seconds(String s[]){
        int hours = Integer.parseInt(s[0]) * 60 * 60; //convert in seconds
        int mintues = Integer.parseInt(s[1]) * 60; //convert in seconds
        int seconds = Integer.parseInt(s[2]); //itself seconds
        return hours + mintues + seconds;
    }
    public int secondsBetweenTimes(String startTime, String endTime) {
        String s1[] = startTime.split(":");
        String s2[] = endTime.split(":");

        return seconds(s2) - seconds(s1);
    }
}