// class Solution {
//     public void sortColors(int[] nums) {
//         int zeroCnt=0, oneCnt = 0, twoCnt = 0;
//         for(int i=0; i<nums.length; i++){
//             if(nums[i]==0){
//                 zeroCnt++;
//             }
//             else if(nums[i]==1){
//                 oneCnt++;
//             }else{
//                 twoCnt++;
//             }
//         }
//         int ArrayIterator = 0;
//         if(ArrayIterator<nums.length){
//             while(zeroCnt>=1){
//                 nums[ArrayIterator] = 0;
//                 ArrayIterator++;
//                 zeroCnt--;
//             }
//             while(oneCnt>=1){
//                 nums[ArrayIterator] = 1;
//                 ArrayIterator++;
//                 oneCnt--;
//             }
//             while(twoCnt>=1){
//                 nums[ArrayIterator] = 2;
//                 ArrayIterator++;
//                 twoCnt--;
//             }
//         }
//     }
// }

class Solution {
    public void sortColors(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        int count[] = new int[largest+1];
        for(int i=0 ; i<nums.length ; i++){
            count[nums[i]]++;
        }

        int j =0 ;
        for(int i=0 ; i<count.length ; i++){
            while(count[i] >0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}
