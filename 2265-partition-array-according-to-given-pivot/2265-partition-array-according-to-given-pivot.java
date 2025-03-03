class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==pivot){
                equal.add(pivot);
            }
            else if(nums[i] < pivot){
                left.add(nums[i]);
            }
            else if(nums[i] != pivot){
                right.add(nums[i]);
            }
        }
        //  for(int j=0; j<left.size(); j++){
        //     System.out.print(left.get(j)+" ");
        // }
        int temp[] = new int[nums.length];
        int i=0;
        for(i=0; i<left.size(); i++){
            temp[i] = left.get(i);
        }
        for(int k=0; k<equal.size(); k++){
            System.out.print(equal.get(k));
            temp[i++] = equal.get(k);
        }
        //System.out.println(count);
        // for(int j=0; j<count && i>=count; i++,j++){
        //     temp[i] = pivot;
            
        // }
        
        for(int j=0; j<right.size();i++, j++){
           // System.out.print(right.get(j)+" ");
            temp[i] = right.get(j);
        }
       
        System.out.println();
        
        return temp;
    }
}