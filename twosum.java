import java.util.Map;

class twosum { 
    public int[] twoSum(int[] nums, int target) { 
        /** 
         * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
         *You may assume that each input would have exactly one solution, and you may not use the same element twice.
         You can return the answer in any order.


         for ex:  
         [1,2,3,4,5,6] target: 4
         output: [0,2]
        */

        /** 
        for(int i=0; i<nums.length; i++){ 
            for(int j=i+1; j<nums.length; j++){ 
                int complement = target - nums[i];
                if (nums[j] == complement){ 
                    return new int[] {i,j};
                }
            }

        }

        throw new IllegalArgumentException("no match found");
        */

        //more efficient solution

        Map<Integer, Integer> num_map = new HashMap<>(); //hash maps have constant time lookup. linear run time. an array wouldn't be linear
        for(int i=0; i<nums.length; i++){ 
            int complement = target - nums[i];
            if (num_map.containsKey(complement)){ 
                return new int[] {num_map.get(complement),i};
            }
            num_map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no match found!");



    }
}