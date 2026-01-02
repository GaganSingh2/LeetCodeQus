import java.util.Hashtable;
class Solution {
    public int repeatedNTimes(int[] nums) {
        Hashtable<Integer,Integer> table = new Hashtable<>();
        for(int val: nums){
            if(table.containsKey(val)){
                table.put(val, table.get(val)+1);
            }
            else{
                table.put(val,1);
            }
        }
        int res = 0;
        int n = nums.length / 2;
        for(Map.Entry<Integer, Integer> entry : table.entrySet()){
            // System.out.println(entry.getKey()+" "+entry.getValue());
            if(entry.getValue()==n){
                res = entry.getKey();
                
                break;
            }
            
        }
        return res;
    }
}