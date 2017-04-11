package algorithms.longest_substring_without_repeating_characters;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <简单描述>
 * Created by Yealove on 2017-03-16.
 */
public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2() throws Exception {
        Assert.assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(9, solution.lengthOfLongestSubstring("pwwkew123456"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(4, solution.lengthOfLongestSubstring("12555210"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(5, solution.lengthOfLongestSubstring("12345"));
    }

    @Test
    public void test6() {
        String s = "bffamxdnxjqoyirmirernekxdlicjfqkkvnxuqmszcixmzkwsqoiwyfalpeuuugfrteomqinuqnirxelpstosaodqszkogr";
        Assert.assertEquals(12, solution.lengthOfLongestSubstring(s));
    }
}