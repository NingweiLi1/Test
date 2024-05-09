import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args) {

//        int[] nums = new int[]{0,3,7,2,5,8,4,6,0,1};
//        int[] nums = new int[]{100,4,200,1,3,2};
        int[] nums = new int[]{1,2,0,1};

        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] numss){
        Integer longestLength = 0;

        Set<Integer> nums = new HashSet<>();

        for (int i : numss) {
            nums.add(numss[i]);
        }

        for (Integer num : nums) {
            if(!nums.contains(num-1)){
                Integer currentNum = num;
                Integer currentLength = 1;

                while (nums.contains(currentNum+1)){
                    currentNum++;
                    currentLength++;
                }
                longestLength = Math.max(longestLength,currentLength);
            }
        }
        return longestLength;
    }
}
