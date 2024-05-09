import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//移动零
public class MoveZeroes {
    public static void main(String[] args) {

    }

    public static void moveZeroes(int[] nums){

        if(nums == null || nums.length<1){
            return;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            //不等于0交换位置
            if(nums[i] != 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }

    }
}
