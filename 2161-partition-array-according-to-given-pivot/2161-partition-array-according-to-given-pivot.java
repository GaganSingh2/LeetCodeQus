class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        //1st Approach using 2 Pointer--------------------------------
        int len = nums.length;
        int res[] = new int[len];
        int si = 0, ei = len-1;//this pointer is used to store the value in result array
        int i = 0, j = len-1;
        //Iterate over nums left to right and 
        while(i<len){
            //si : position where you can put an element < pivot
            if(nums[i]<pivot){
                res[si] = nums[i];
                si++;
            }
            //ei: position where you can put an element > pivot
            if(nums[j]>pivot){
                res[ei] = nums[j];
                ei--;
            }
            i++;
            j--;
        }

        //then after filling all smaller and greater elements, 
        //in the remaining spaces we fill elements equal to pivot
        while(si<=ei){
            res[si] = pivot;
            si++;
        }

        return res;
        //2nd Approach-------------------------------------------
        // ArrayList<Integer> left = new ArrayList<>();
        // ArrayList<Integer> right = new ArrayList<>();
        // ArrayList<Integer> equal = new ArrayList<>();
        // int count=0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==pivot){
        //         equal.add(pivot);
        //     }
        //     else if(nums[i] < pivot){
        //         left.add(nums[i]);
        //     }
        //     else if(nums[i] != pivot){
        //         right.add(nums[i]);
        //     }
        // }
        // int temp[] = new int[nums.length];
        // int i=0;
        // for(i=0; i<left.size(); i++){
        //     temp[i] = left.get(i);
        // }
        // for(int k=0; k<equal.size(); k++){
        //     System.out.print(equal.get(k));
        //     temp[i++] = equal.get(k);
        // }
        // for(int j=0; j<right.size();i++, j++){
        //     temp[i] = right.get(j);
        // }
        // return temp;
    }
}