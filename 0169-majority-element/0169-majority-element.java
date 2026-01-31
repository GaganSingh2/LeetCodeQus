class Solution{
    public int majorityElement(int[] nums){
        int times = nums.length/2;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
            if(freq.get(nums[i])>times){
                return nums[i];
            }
        }
        return -1;
    }
}


// class Solution {
//     public int majorityElement(int[] nums) {
//         int count = 1;
//         int len = nums.length;
//         int res = 0;
//         // Arrays.sort(nums);
//         for(int i=0; i<=nums.length-1; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             if(count > len/2){
//                 return nums[i];
//             }
//             count = 1;
//         }
//         if(count > len/2){
//             res = nums[len-1];
//         }
//         return res;
//     }
// }
// 




// class Solution{
    // public int majorityElement(int[] nums){
//        return majorityElementFin(nums,0,nums.length-1);
//     }

//     private static int countVal(int nums[],int val,int si,int ei){
//         int count = 0;
//         for(int i=si; i<=ei; i++){
//             if(nums[i]==val){
//                 count++;
//             }
//         }
//         return count;
//     }

//     private static int majorityElementFin(int nums[],int si, int ei){
//         // Base case
//         if(si==ei) return nums[si];

//         int mid = si+(ei-si)/2;

//         int leftPart = majorityElementFin(nums,si,mid);
//         int rightPart = majorityElementFin(nums,mid+1,ei);
       
//         if(leftPart == rightPart) return leftPart;

//         int leftCnt = countVal(nums,leftPart,si,ei);
//         int rightCnt = countVal(nums,rightPart,si,ei);

//         return leftCnt>rightCnt? leftPart: rightPart;
//     }
// }





















