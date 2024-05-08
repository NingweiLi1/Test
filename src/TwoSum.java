import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TwoSum {
    public static void main(String[] args) {

        //造测试数据
        List<Integer> nums = new ArrayList<>();
        for (int i=0;i<10;i++){
            nums.add(i+1);
        }

        List<Integer> indexs = twoSum(nums,12);
        System.out.println(nums);
        System.out.println(indexs);
    }


    public static List<Integer> twoSum(List<Integer> nums, Integer target) {

        Map<Integer,Integer> indexMap = new HashMap<>();

        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if(indexMap.containsKey(target- nums.get(i))){
                indexList.add(i);
                indexList.add(indexMap.get(target- nums.get(i)));
                return indexList;
            }
            indexMap.put(nums.get(i),i);
        }

        return indexList;

    }
}