class Solution {


     public int[] twoSum(int[] nums, int target) {

         HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++ ){
            int remain = target - nums[i];
            if(map.containsKey(remain)){

                if(map.get(remain) < i){
                    return new int[] {map.get(remain), i };
                }else{
                return new int[] {i , map.get(remain) };
                }

            }
                

            map.put(nums[i], i);

        }

        return null;













    //     for(int i = 0; i<nums.length;i++){
    //         for(int j =i+1; j<nums.length; j++){
    //             if(nums[i] + nums[j] == target){
    //                 if(i>j){
    //                     return new int []{ j,i};
    //                 }else{
    //                     return new int []{i,j};
    //                 }
    //             }
    //         }
    //     }

    //     return null;
        
    }







}
