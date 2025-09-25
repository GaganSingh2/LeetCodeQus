class Solution {
    public int compareVersion(String version1, String version2) {
        String tmp1[] = version1.split("[.]");
        String tmp2[] = version2.split("[.]");
        
        int len = Math.max(tmp1.length,tmp2.length);
        for(int i=0; i<len; i++){
            int t1 = i<tmp1.length? Integer.parseInt(tmp1[i]):0;
            int t2 = i<tmp2.length? Integer.parseInt(tmp2[i]):0;
            if(t1<t2){
                return -1;
            }
            else if(t1>t2){
                return 1;
            }
        }
        return 0;
    }
}