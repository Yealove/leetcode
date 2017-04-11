package algorithms.longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 11行
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    /**
     * 循环一次
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring2(String s) {
        int len = s.length();
        if (len < 2) {
            return len;
        }
        int max = 0;
        char[] chars = s.toCharArray();
        //计算开始位置
        int currentStart = 1;

        Map<Character, Integer> map = new HashMap<>(len);
        for (int i = 1; i <= len; i++) {
            char c = chars[i - 1];
            Integer repeatIndex = map.get(c);
            if (repeatIndex != null && repeatIndex >= currentStart) {
                int temp = i - currentStart;
                max = Math.max(max, temp);

                //如果重复了，则从重复的下一个位置开始计算下一个字符串
                currentStart = repeatIndex + 1;
                //如果后面的长度小于当前最大长度则不再计算，以为可以减少计算时间实际增加了计算时间
                //if (currentStart + max > len) {
                //    break;
                //}
            }

            map.put(c, i);
        }

        //如果循环到最后都没有重复的，则要多加1
        int last = len - currentStart + 1;
        max = Math.max(last, max);

        return max;
    }

    /**
     * 从前往后比较，一直到有重复的字段
     * O(n)
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        int max = 0;
        char[] chars = s.toCharArray();
        int len = chars.length;
        StringBuilder sb = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len && !sb.toString().contains(chars[j] + ""); j++) {
                sb.append(chars[j]);
            }
            int temp = sb.length();
            max = max > temp ? max : temp;
            sb.delete(0, temp);
        }
        return max;
    }
}