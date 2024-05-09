import java.util.*;
//字母异位词分组
public class GroupAnagrams {
    public static void main(String[] args) {

        List<String> strs = new ArrayList<>();
//        strs.add("abc");
//        strs.add("bca");
        strs.add("a");
//        strs.add("");
        List<List<String>> res = groupAnagrams(strs);
        System.out.println(res);
    }

    public static List<List<String>> groupAnagrams(List<String> strs){

        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> indexMap = new HashMap<>();
        for (Integer i = 0; i < strs.size(); i++) {
            char[] chars = strs.get(i).toCharArray();
            Arrays.sort(chars);
            List<String> indexs = new ArrayList<>();

            if (indexMap.containsKey(Arrays.toString(chars))){
                indexs = indexMap.get(Arrays.toString(chars));
            }
            indexs.add(strs.get(i));
            indexMap.put(Arrays.toString(chars),indexs);
        }

        for (String key : indexMap.keySet()) {
            res.add(indexMap.get(key));
        }

        return res;
    }
}
