import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupedAnagrams {
        public static List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> result = new ArrayList<>();
            if (strs.length == 0) return result;
            HashMap<String, List<String>> map = new HashMap<>();
            for (String s : strs) {
                char[] hash = new char[26];
                for (char c : s.toCharArray()) {
                    hash[c - 'a']++;
                }
                String key = new String(hash);
                map.computeIfAbsent(key, k -> new ArrayList<>());
                map.get(key).add(s);
            }
            result.addAll(map.values());
            return result;
        }

        public static void main (String[] args) {

            //uncomment block code per test case to check for accuracy!
            //test 1 result = [["bat"],["nat","tan"],["ate","eat","tea"]]
            String[] strs = {"eat","tea","tan","ate","nat","bat"};

            //test 2 result = [[""]]
            /*String[] strs = {""};*/

            //test 3 result = [["a"]]
            /*String[] strs = {"a"};*/

            System.out.println(groupAnagrams(strs));
        }
}
