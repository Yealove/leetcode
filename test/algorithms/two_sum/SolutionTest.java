package algorithms.two_sum;

import org.junit.Assert;
import org.junit.Test;

/**
 * <简单描述>
 * Created by Yealove on 2017-03-14.
 */
public class SolutionTest {
    Solution s = new Solution();

    @Test
    public void twoSum() throws Exception {
        int[] t1 = {1, 2, 7, 4};
        Assert.assertArrayEquals(new int[]{0, 1}, s.twoSum(t1, 3));
        Assert.assertArrayEquals(new int[]{0, 2}, s.twoSum(t1, 8));
        Assert.assertArrayEquals(new int[]{0, 3}, s.twoSum(t1, 5));
        Assert.assertArrayEquals(new int[]{1, 2}, s.twoSum(t1, 9));
    }

}