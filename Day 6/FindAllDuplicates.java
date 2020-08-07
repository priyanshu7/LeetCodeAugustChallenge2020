package august2020;

import java.util.*;

public class FindAllDuplicates {
	
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                res.add(index+1);
            }else{
                nums[index] = - nums[index];
            }
        }
        return res;
    }

}
